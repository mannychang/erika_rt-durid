/*
 * Created on 8-giu-2004
 *
 * $Id: Convert.java,v 1.1 2005/09/28 15:22:29 durin Exp $
 */
package com.eu.evidence.rtdruid.ant.vartree;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.FileList;
import org.apache.tools.ant.types.FileSet;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import com.eu.evidence.rtdruid.ant.common.AntMessages;
import com.eu.evidence.rtdruid.ant.common.Util;
import com.eu.evidence.rtdruid.desk.Messages;
import com.eu.evidence.rtdruid.desk.RTDFactory;
import com.eu.evidence.rtdruid.vartree.IVarTree;
import com.eu.evidence.rtdruid.vartree.data.ObjectWithID;

/**
 * @author Nicola Serreli
 *
 *
 */
public class Convert extends Task {
	
	protected ArrayList allFiles = new ArrayList();
	protected String store = null;
	
	
	public void addConfigured(FileList files) {
		String dir = files.getDir(getProject()).getPath();
		if (dir == null) {
			dir = "";
		} else if (!dir.endsWith(System.getProperty("file.separator"))) {
			dir += System.getProperty("file.separator");
		}
		
		String[] elFiles = files.getFiles(getProject());
		for(int i=0; i<elFiles.length; i++) {
			allFiles.add(dir + elFiles[i]);
		}
	}
	
	public void addConfigured(FileSet files) {
	    String dir = files.getDir(getProject()).getPath();
		if (dir == null) {
			dir = "";
		} else if (!dir.endsWith(System.getProperty("file.separator"))) {
			dir += System.getProperty("file.separator");
		}

		String[] elFiles = files.getDirectoryScanner(getProject()).getIncludedFiles();
		for(int i=0; i<elFiles.length; i++) {
			allFiles.add(dir + elFiles[i]);
//        	myLog("FILE SET ", elFiles[i]);
		}
	}
	
	public void setStore(String fileName) {
		store = fileName;
	}
	
	protected IVarTree loadFiles() {
        if (allFiles.size() == 0) {
        	throw new BuildException("At least one input file is required");
        }
        
        IVarTree vt = (IVarTree) RTDFactory.get(IVarTree.class);
        
        // load files
        ObjectWithID[] roots = new ObjectWithID[allFiles.size()];
        for (int i=0; i<allFiles.size(); i++) {
        	String fname = (String) allFiles.get(i);
        	myLog("Loading", fname);
        	Resource res = null;
            try {
            	res = Util.loadData(fname);
            } catch (RuntimeException e) {
            	throw new BuildException(e.getMessage());
            }
	        if (res.getContents().size() == 0) {
	        	throw new BuildException(fname + " doesn't have data");
	        }
	        roots[i] = (ObjectWithID) res.getContents().get(0);
        }
        
        
/*		if (Messages.getErrorNumber() > 0
				|| (Messages.getWarningNumber() > 0 && stopOnWarning)) {
			
			throw new BuildException("Some problems with input files");
		}*/
		Messages.clearNumbers();

        
        // merge loaded files (throw exceptions if they aren't compatible,
        // like different System name) 
        ObjectWithID root = (ObjectWithID) roots[0].clone();
        { // store all in VarTree (to enable merge is required that a resource contains the "root" object)
	        vt.setRoot(root);
        }
        for (int i=1; i<roots.length; i++) {
        	myLog("Merging",(String) allFiles.get(i));
        	try {
        		root.merge(roots[i], "", false);
        	} catch (RuntimeException e) {
        		throw new BuildException(e.getMessage());
        	}
        }
        
        return vt;
	}

	protected void saveFile(IVarTree vt) {
        if (store == null) {
        	return;
        }

    	myLog("Storing", store);
        try {
	        Resource res = (Resource) vt.getResourceSet().getResources().get(0);
	        res.setURI(URI.createFileURI(store));
	        
        	res.save(new HashMap());
        } catch (IOException e) {
        	throw new BuildException(e.getMessage());
        } catch (RuntimeException e) {
        	throw new BuildException(e.getMessage());
        }
	}

	
	public void execute() throws BuildException {
		
		Messages.setCurrent(new AntMessages(this));
		try {
			saveFile(loadFiles());
		} finally {
			Messages.setPrevious();
		}
	}
	
	protected void myLog(String left, String right) {
		final int LEFT_SIZE = 10;
		
		log("[" + left 
				+ ("                 ".substring(0,
						(left.length()> LEFT_SIZE-1 ? 1 : LEFT_SIZE-left.length()))
				) + right + "]");	
	}
}