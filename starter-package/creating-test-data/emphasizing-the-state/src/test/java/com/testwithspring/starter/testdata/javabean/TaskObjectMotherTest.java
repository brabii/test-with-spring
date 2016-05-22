package com.testwithspring.starter.testdata.javabean;

import org.junit.Test;

/**
 * This class demonstrates how we can emphasize the state of the created
 * {@code Task} objects by an object mother class.
 *
 * <strong>Note:</strong> The test method names found from this class suck. Do not use similar names in your tests.
 *
 * @author Petri Kainulainen
 */
public class TaskObjectMotherTest {

    private static final Long ASSIGNEE_ID = 99L;

    /**
     * This test method emphasizes the fact that the task is open task. The other
     * properties of the task are irrelevant to us.
     */
    @Test
    public void createOpenTaskWithoutAssignee() {
        Task openTask = TaskBuilder.openTaskWithoutAssignee();
    }

    /**
     * This test method emphasizes the fact that the task is an open task that
     * has an assignee. The other properties of the task are irrelevant to us.
     */
    @Test
    public void createOpenTaskThatIsAssignedToAssignee() {
        Task assignedTask = TaskBuilder.openTaskWithAssignee(ASSIGNEE_ID);
    }

    /**
     * This method emphasizes the fact that the assignee is working on a task.
     * We don't care about other properties of the created object.
     */
    @Test
    public void createTaskThatIsInProgress() {
        Task inProgress = TaskBuilder.taskThatIsInProgress(ASSIGNEE_ID);
    }

    /**
     * We care only about the fact that the task was closed as done. The other
     * properties of the created object are irrelevant to us.
     */
    @Test
    public void createTaskThatWasClosedAsDone() {
        Task done = TaskBuilder.closedAsDone();
    }

    /**
     * This test method emphasizes that the task was closed as a duplicate. We don't
     * really care about the other property values of the created object.
     */
    @Test
    public void createTaskThatWasClosedAsDuplicate() {
        Task duplicate = TaskBuilder.closedAsDuplicate();
    }

    /**
     * We care only about the fact the created task was closed because it won't be done.
     * We don't care about the other property values of the created task.
     */
    @Test
    public void createTaskThatWasClosedAsWontDo() {
        Task wontDo = TaskBuilder.closedAsWontDo();
    }
}