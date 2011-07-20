package com.eu.evidence.rtdruid.modules.oil.codewriter.common.xsltcodegeneration;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

import com.eu.evidence.rtdruid.desk.RtdruidLog;

public class XsltUtils {
	
	public static String writeXml(Document data) {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		writeXml(data, output);
		return output.toString();
	}

	public static void writeXml(Document data, OutputStream out) {
		if (data == null) {
			return;
		}
	
		try {
			Transformer transformer = TransformerFactory.newInstance()
					.newTransformer();
	
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			// Transform the source XML
			transformer.transform(new DOMSource(data), new StreamResult(out));
	
		} catch (TransformerConfigurationException tce) {
			// Error generated by the parser
			RtdruidLog.log("Transformer Factory error", tce);
	
			// Use the contained exception, if any
//			Throwable x = tce;
//			if (tce.getException() != null)
//				x = tce.getException();
//			x.printStackTrace();
	
		} catch (TransformerException te) {
			// Error generated by the parser
			RtdruidLog.log("Transformer Factory error", te);
	
			// Use the contained exception, if any
//			Throwable x = te;
//			if (te.getException() != null)
//				x = te.getException();
//			x.printStackTrace();
	
		}
	}

}
