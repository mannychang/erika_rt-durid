/**
 * <copyright>
 * </copyright>
 *
 * $Id: DataItemProviderAdapterFactory.java,v 1.2 2008/03/26 18:23:51 durin Exp $
 */
package com.eu.evidence.rtdruid.internal.vartree.data.provider;


import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import com.eu.evidence.rtdruid.internal.vartree.data.init.DataAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataItemProviderAdapterFactory extends DataAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Class<?>> supportedTypes = new ArrayList<Class<?>>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataItemProviderAdapterFactory() {
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.System} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemItemProvider systemItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		if (systemItemProvider == null) {
			systemItemProvider = new SystemItemProvider(this);
		}

		return systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Modes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModesItemProvider modesItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Modes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createModesAdapter() {
		if (modesItemProvider == null) {
			modesItemProvider = new ModesItemProvider(this);
		}

		return modesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Mode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeItemProvider modeItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Mode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createModeAdapter() {
		if (modeItemProvider == null) {
			modeItemProvider = new ModeItemProvider(this);
		}

		return modeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Functional} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalItemProvider functionalItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Functional}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createFunctionalAdapter() {
		if (functionalItemProvider == null) {
			functionalItemProvider = new FunctionalItemProvider(this);
		}

		return functionalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Proc} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcItemProvider procItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Proc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createProcAdapter() {
		if (procItemProvider == null) {
			procItemProvider = new ProcItemProvider(this);
		}

		return procItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Architectural} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitecturalItemProvider architecturalItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Architectural}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createArchitecturalAdapter() {
		if (architecturalItemProvider == null) {
			architecturalItemProvider = new ArchitecturalItemProvider(this);
		}

		return architecturalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Mapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingItemProvider mappingItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		if (mappingItemProvider == null) {
			mappingItemProvider = new MappingItemProvider(this);
		}

		return mappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Annotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationItemProvider annotationItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		if (annotationItemProvider == null) {
			annotationItemProvider = new AnnotationItemProvider(this);
		}

		return annotationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Schedulability} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulabilityItemProvider schedulabilityItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Schedulability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createSchedulabilityAdapter() {
		if (schedulabilityItemProvider == null) {
			schedulabilityItemProvider = new SchedulabilityItemProvider(this);
		}

		return schedulabilityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Var} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarItemProvider varItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Var}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVarAdapter() {
		if (varItemProvider == null) {
			varItemProvider = new VarItemProvider(this);
		}

		return varItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Trigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerItemProvider triggerItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		if (triggerItemProvider == null) {
			triggerItemProvider = new TriggerItemProvider(this);
		}

		return triggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.PartialOrder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialOrderItemProvider partialOrderItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.PartialOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPartialOrderAdapter() {
		if (partialOrderItemProvider == null) {
			partialOrderItemProvider = new PartialOrderItemProvider(this);
		}

		return partialOrderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.SubSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSystemItemProvider subSystemItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.SubSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createSubSystemAdapter() {
		if (subSystemItemProvider == null) {
			subSystemItemProvider = new SubSystemItemProvider(this);
		}

		return subSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.TimeConst} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeConstItemProvider timeConstItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.TimeConst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTimeConstAdapter() {
		if (timeConstItemProvider == null) {
			timeConstItemProvider = new TimeConstItemProvider(this);
		}

		return timeConstItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.MethodRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodRefItemProvider methodRefItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.MethodRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createMethodRefAdapter() {
		if (methodRefItemProvider == null) {
			methodRefItemProvider = new MethodRefItemProvider(this);
		}

		return methodRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.ProvidedInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedInterfaceItemProvider providedInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.ProvidedInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createProvidedInterfaceAdapter() {
		if (providedInterfaceItemProvider == null) {
			providedInterfaceItemProvider = new ProvidedInterfaceItemProvider(this);
		}

		return providedInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.RequiredInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredInterfaceItemProvider requiredInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.RequiredInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createRequiredInterfaceAdapter() {
		if (requiredInterfaceItemProvider == null) {
			requiredInterfaceItemProvider = new RequiredInterfaceItemProvider(this);
		}

		return requiredInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Order} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemProvider orderItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createOrderAdapter() {
		if (orderItemProvider == null) {
			orderItemProvider = new OrderItemProvider(this);
		}

		return orderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.TimeConstElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeConstElementItemProvider timeConstElementItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.TimeConstElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTimeConstElementAdapter() {
		if (timeConstElementItemProvider == null) {
			timeConstElementItemProvider = new TimeConstElementItemProvider(this);
		}

		return timeConstElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Ecu} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcuItemProvider ecuItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Ecu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createEcuAdapter() {
		if (ecuItemProvider == null) {
			ecuItemProvider = new EcuItemProvider(this);
		}

		return ecuItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Task} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskItemProvider taskItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		if (taskItemProvider == null) {
			taskItemProvider = new TaskItemProvider(this);
		}

		return taskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Resource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceItemProvider resourceItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		if (resourceItemProvider == null) {
			resourceItemProvider = new ResourceItemProvider(this);
		}

		return resourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Bus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusItemProvider busItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Bus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createBusAdapter() {
		if (busItemProvider == null) {
			busItemProvider = new BusItemProvider(this);
		}

		return busItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Frame} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameItemProvider frameItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Frame}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createFrameAdapter() {
		if (frameItemProvider == null) {
			frameItemProvider = new FrameItemProvider(this);
		}

		return frameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Signal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalItemProvider signalItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createSignalAdapter() {
		if (signalItemProvider == null) {
			signalItemProvider = new SignalItemProvider(this);
		}

		return signalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Mutex} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MutexItemProvider mutexItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Mutex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createMutexAdapter() {
		if (mutexItemProvider == null) {
			mutexItemProvider = new MutexItemProvider(this);
		}

		return mutexItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Cpu} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CpuItemProvider cpuItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Cpu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createCpuAdapter() {
		if (cpuItemProvider == null) {
			cpuItemProvider = new CpuItemProvider(this);
		}

		return cpuItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Rtos} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtosItemProvider rtosItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Rtos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createRtosAdapter() {
		if (rtosItemProvider == null) {
			rtosItemProvider = new RtosItemProvider(this);
		}

		return rtosItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Scheduling} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingItemProvider schedulingItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Scheduling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createSchedulingAdapter() {
		if (schedulingItemProvider == null) {
			schedulingItemProvider = new SchedulingItemProvider(this);
		}

		return schedulingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Activation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivationItemProvider activationItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Activation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createActivationAdapter() {
		if (activationItemProvider == null) {
			activationItemProvider = new ActivationItemProvider(this);
		}

		return activationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.ResourceRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRefItemProvider resourceRefItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.ResourceRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createResourceRefAdapter() {
		if (resourceRefItemProvider == null) {
			resourceRefItemProvider = new ResourceRefItemProvider(this);
		}

		return resourceRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.MutexRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MutexRefItemProvider mutexRefItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.MutexRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createMutexRefAdapter() {
		if (mutexRefItemProvider == null) {
			mutexRefItemProvider = new MutexRefItemProvider(this);
		}

		return mutexRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.ExecTime} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecTimeItemProvider execTimeItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.ExecTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createExecTimeAdapter() {
		if (execTimeItemProvider == null) {
			execTimeItemProvider = new ExecTimeItemProvider(this);
		}

		return execTimeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.ExecTimeList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecTimeListItemProvider execTimeListItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.ExecTimeList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createExecTimeListAdapter() {
		if (execTimeListItemProvider == null) {
			execTimeListItemProvider = new ExecTimeListItemProvider(this);
		}

		return execTimeListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Distribution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributionItemProvider distributionItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Distribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDistributionAdapter() {
		if (distributionItemProvider == null) {
			distributionItemProvider = new DistributionItemProvider(this);
		}

		return distributionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Sample} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SampleItemProvider sampleItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Sample}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createSampleAdapter() {
		if (sampleItemProvider == null) {
			sampleItemProvider = new SampleItemProvider(this);
		}

		return sampleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.ProcMap} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcMapItemProvider procMapItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.ProcMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createProcMapAdapter() {
		if (procMapItemProvider == null) {
			procMapItemProvider = new ProcMapItemProvider(this);
		}

		return procMapItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.TaskMap} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskMapItemProvider taskMapItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.TaskMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTaskMapAdapter() {
		if (taskMapItemProvider == null) {
			taskMapItemProvider = new TaskMapItemProvider(this);
		}

		return taskMapItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.VarMap} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarMapItemProvider varMapItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.VarMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVarMapAdapter() {
		if (varMapItemProvider == null) {
			varMapItemProvider = new VarMapItemProvider(this);
		}

		return varMapItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.SchedulingScenario} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingScenarioItemProvider schedulingScenarioItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.SchedulingScenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createSchedulingScenarioAdapter() {
		if (schedulingScenarioItemProvider == null) {
			schedulingScenarioItemProvider = new SchedulingScenarioItemProvider(this);
		}

		return schedulingScenarioItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.CpuSched} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CpuSchedItemProvider cpuSchedItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.CpuSched}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createCpuSchedAdapter() {
		if (cpuSchedItemProvider == null) {
			cpuSchedItemProvider = new CpuSchedItemProvider(this);
		}

		return cpuSchedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.TaskSched} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskSchedItemProvider taskSchedItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.TaskSched}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTaskSchedAdapter() {
		if (taskSchedItemProvider == null) {
			taskSchedItemProvider = new TaskSchedItemProvider(this);
		}

		return taskSchedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.CacheMissCostList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheMissCostListItemProvider cacheMissCostListItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.CacheMissCostList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createCacheMissCostListAdapter() {
		if (cacheMissCostListItemProvider == null) {
			cacheMissCostListItemProvider = new CacheMissCostListItemProvider(this);
		}

		return cacheMissCostListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.CacheMissCost} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheMissCostItemProvider cacheMissCostItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.CacheMissCost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createCacheMissCostAdapter() {
		if (cacheMissCostItemProvider == null) {
			cacheMissCostItemProvider = new CacheMissCostItemProvider(this);
		}

		return cacheMissCostItemProvider;
	}
	
	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Field} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldItemProvider fieldItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		if (fieldItemProvider == null) {
			fieldItemProvider = new FieldItemProvider(this);
		}

		return fieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.Type} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeItemProvider typeItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		if (typeItemProvider == null) {
			typeItemProvider = new TypeItemProvider(this);
		}

		return typeItemProvider;
	}
	
	/**
	 * This keeps track of the one adapter used for all {@link rtdruid.vartree.data.OsApplication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsApplicationItemProvider osApplicationItemProvider;

	/**
	 * This creates an adapter for a {@link rtdruid.vartree.data.OsApplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createOsApplicationAdapter() {
		if (osApplicationItemProvider == null) {
			osApplicationItemProvider = new OsApplicationItemProvider(this);
		}

		return osApplicationItemProvider;
	}
	
	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

}
