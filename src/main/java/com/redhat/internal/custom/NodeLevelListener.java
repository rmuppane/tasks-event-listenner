package com.redhat.internal.custom;

import java.util.Map;

import org.jbpm.services.api.ProcessService;
import org.jbpm.services.api.service.ServiceRegistry;
import org.kie.api.event.process.ProcessCompletedEvent;
import org.kie.api.event.process.ProcessEventListener;
import org.kie.api.event.process.ProcessNodeLeftEvent;
import org.kie.api.event.process.ProcessNodeTriggeredEvent;
import org.kie.api.event.process.ProcessStartedEvent;
import org.kie.api.event.process.ProcessVariableChangedEvent;
import org.kie.api.runtime.process.ProcessContext;
import org.kie.server.services.api.KieContainerInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.internal.util.SharedAssets;

public class NodeLevelListener implements ProcessEventListener {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(NodeLevelListener.class);
	
	private  KieContainerInstance kieContainer;
	
	private ProcessContext kcontext;
	
	
	public NodeLevelListener(final KieContainerInstance kieContainer) {
		 this.kieContainer = kieContainer;
	}
	
	public NodeLevelListener() {
	}

	@Override
	public void afterNodeLeft(ProcessNodeLeftEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterProcessCompleted(ProcessCompletedEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterProcessStarted(ProcessStartedEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterVariableChanged(ProcessVariableChangedEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNodeLeft(ProcessNodeLeftEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNodeTriggered(ProcessNodeTriggeredEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeProcessCompleted(ProcessCompletedEvent event) {
		System.out.println("Entered into beforeProcessCompleted>>>>>>>>>>>>>>");
		ProcessService ps = (ProcessService)ServiceRegistry.get().service(ServiceRegistry.PROCESS_SERVICE);
		Map<String, Object> processInstaneVariable = ps.getProcessInstanceVariables(event.getProcessInstance().getId());
		processInstaneVariable.get("DecisionOutput");
		SharedAssets.sharedMap.put("DecisionOutput", processInstaneVariable.get("DecisionOutput"));
	}

	@Override
	public void beforeProcessStarted(ProcessStartedEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeVariableChanged(ProcessVariableChangedEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	
}
