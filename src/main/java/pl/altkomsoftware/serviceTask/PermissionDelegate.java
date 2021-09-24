package pl.altkomsoftware.serviceTask;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class PermissionDelegate implements JavaDelegate {

    private  final Logger LOGGER = Logger.getLogger(PermissionDelegate.class.getName());
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        LOGGER.info("PermissionGranted" + delegateExecution.getCurrentActivityName() + " " + delegateExecution.getProcessInstanceId());

    }
}
