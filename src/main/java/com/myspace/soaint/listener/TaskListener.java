package com.myspace.soaint.listener;

import org.kie.api.task.TaskEvent;
import org.kie.api.task.TaskLifeCycleEventListener;

public class TaskListener implements TaskLifeCycleEventListener {

	@Override
	public void beforeTaskActivatedEvent(TaskEvent event) {
		System.out.println("beforeTaskActivatedEvent");

	}

	@Override
	public void beforeTaskClaimedEvent(TaskEvent event) {
		System.out.println("beforeTaskClaimedEvent");

	}

	@Override
	public void beforeTaskSkippedEvent(TaskEvent event) {
		System.out.println("beforeTaskSkippedEvent");

	}

	@Override
	public void beforeTaskStartedEvent(TaskEvent event) {
		System.out.println("beforeTaskStartedEvent");

	}

	@Override
	public void beforeTaskStoppedEvent(TaskEvent event) {
		System.out.println("beforeTaskStoppedEvent");

	}

	@Override
	public void beforeTaskCompletedEvent(TaskEvent event) {
		System.out.println("beforeTaskCompletedEvent");

	}

	@Override
	public void beforeTaskFailedEvent(TaskEvent event) {
		System.out.println("beforeTaskFailedEvent");

	}

	@Override
	public void beforeTaskAddedEvent(TaskEvent event) {
		System.out.println("");

	}

	@Override
	public void beforeTaskExitedEvent(TaskEvent event) {
		System.out.println("beforeTaskExitedEvent");

	}

	@Override
	public void beforeTaskReleasedEvent(TaskEvent event) {
		System.out.println("beforeTaskReleasedEvent");

	}

	@Override
	public void beforeTaskResumedEvent(TaskEvent event) {
		System.out.println("beforeTaskResumedEvent");

	}

	@Override
	public void beforeTaskSuspendedEvent(TaskEvent event) {
		System.out.println("beforeTaskSuspendedEvent");

	}

	@Override
	public void beforeTaskForwardedEvent(TaskEvent event) {
		System.out.println("beforeTaskForwardedEvent");

	}

	@Override
	public void beforeTaskDelegatedEvent(TaskEvent event) {
		System.out.println("beforeTaskDelegatedEvent");

	}

	@Override
	public void beforeTaskNominatedEvent(TaskEvent event) {
		System.out.println("beforeTaskNominatedEvent");

	}

	@Override
	public void afterTaskActivatedEvent(TaskEvent event) {
		System.out.println("afterTaskActivatedEvent");

	}

	@Override
	public void afterTaskClaimedEvent(TaskEvent event) {
		System.out.println("afterTaskClaimedEvent");

	}

	@Override
	public void afterTaskSkippedEvent(TaskEvent event) {
		System.out.println("afterTaskSkippedEvent");

	}

	@Override
	public void afterTaskStartedEvent(TaskEvent event) {
		System.out.println("afterTaskStartedEvent");

	}

	@Override
	public void afterTaskStoppedEvent(TaskEvent event) {
		System.out.println("afterTaskStoppedEvent");

	}

	@Override
	public void afterTaskCompletedEvent(TaskEvent event) {
		System.out.println("afterTaskCompletedEvent");

	}

	@Override
	public void afterTaskFailedEvent(TaskEvent event) {
		System.out.println("afterTaskFailedEvent");

	}

	@Override
	public void afterTaskAddedEvent(TaskEvent event) {
		System.out.println("afterTaskAddedEvent");

	}

	@Override
	public void afterTaskExitedEvent(TaskEvent event) {
		System.out.println("afterTaskExitedEvent");

	}

	@Override
	public void afterTaskReleasedEvent(TaskEvent event) {
		System.out.println("afterTaskReleasedEvent");

	}

	@Override
	public void afterTaskResumedEvent(TaskEvent event) {
		System.out.println("afterTaskResumedEvent");

	}

	@Override
	public void afterTaskSuspendedEvent(TaskEvent event) {
		System.out.println("afterTaskSuspendedEvent");

	}

	@Override
	public void afterTaskForwardedEvent(TaskEvent event) {
		System.out.println("afterTaskForwardedEvent");

	}

	@Override
	public void afterTaskDelegatedEvent(TaskEvent event) {
		System.out.println("afterTaskDelegatedEvent");

	}

	@Override
	public void afterTaskNominatedEvent(TaskEvent event) {
		System.out.println("afterTaskNominatedEvent");

	}

}
