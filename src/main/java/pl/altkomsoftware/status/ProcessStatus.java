package pl.altkomsoftware.status;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

import java.util.Random;
import java.util.logging.Logger;

public class ProcessStatus implements ExecutionListener {

    private  final Logger LOGGER = Logger.getLogger(ProcessStatus.class.getName());
    @Override
    public void notify(DelegateExecution delegateExecution) throws Exception {
        if (delegateExecution.getEventName().equals("start")) {
            delegateExecution.setVariable("customerDataNew","");
            int rd = new Random().nextInt(10-1)+1;
            delegateExecution.setVariable("time",rd);
        }
        LOGGER.info(delegateExecution.getEventName() + " " + delegateExecution.getCurrentActivityName() + " " + delegateExecution.getProcessInstanceId());
    }
}
