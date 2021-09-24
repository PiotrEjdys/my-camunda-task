package pl.altkomsoftware.serviceTask;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CustomerSendMessageDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
//        RuntimeService runtimeService = delegateExecution.getProcessEngineServices().getRuntimeService();
//        runtimeService.createMessageCorrelation("messageData").processInstanceId(delegateExecution.getProcessInstanceId()).correlate();
        System.out.println("send");

    }
}
