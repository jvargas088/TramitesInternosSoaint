package com.myspace.soaint.listener;

import org.kie.api.event.process.ProcessCompletedEvent;
import org.kie.api.event.process.ProcessEventListener;
import org.kie.api.event.process.ProcessNodeLeftEvent;
import org.kie.api.event.process.ProcessNodeTriggeredEvent;
import org.kie.api.event.process.ProcessStartedEvent;
import org.kie.api.event.process.ProcessVariableChangedEvent;

public class ProcessListener implements ProcessEventListener {

	@Override
	public void beforeProcessStarted(ProcessStartedEvent event) {
		System.out.println("beforeProcessStarted");

	}

	@Override
	public void afterProcessStarted(ProcessStartedEvent event) {
		System.out.println("afterProcessStarted");

	}

	@Override
	public void beforeProcessCompleted(ProcessCompletedEvent event) {
		System.out.println("beforeProcessCompleted");

	}

	@Override
	public void afterProcessCompleted(ProcessCompletedEvent event) {
		System.out.println("afterProcessCompleted");

	}

	@Override
	public void beforeNodeTriggered(ProcessNodeTriggeredEvent event) {
		System.out.println("beforeNodeTriggered");

	}

	@Override
	public void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
		System.out.println("afterNodeTriggered");

	}

	@Override
	public void beforeNodeLeft(ProcessNodeLeftEvent event) {
		System.out.println("beforeNodeLeft");

	}

	@Override
	public void afterNodeLeft(ProcessNodeLeftEvent event) {
		System.out.println("afterNodeLeft");

	}

	@Override
	public void beforeVariableChanged(ProcessVariableChangedEvent event) {
		System.out.println("beforeVariableChanged");

	}

	@Override
	public void afterVariableChanged(ProcessVariableChangedEvent event) {
		System.out.println("afterVariableChanged");

	}

}
