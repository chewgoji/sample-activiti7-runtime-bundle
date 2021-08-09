package org.activiti.training.sampleactiviti7runtimebundle;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DefaultTaskListener implements TaskListener {
    private final Logger logger = LoggerFactory.getLogger(DefaultTaskListener.class);

    @Override
    public void notify(DelegateTask delegateTask) {
        logger.info("任务监听器-流程实例ID: " + delegateTask.getProcessInstanceId()
                + " 执行人: " + delegateTask.getAssignee());
    }

}