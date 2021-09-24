package pl.altkomsoftware.serviceTask;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;



public class CustomerDataDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String customerData = (String) execution.getVariable("customerData");

        if (customerData.equals("myData")){
            execution.setVariable("customerDataToSend",customerData.toUpperCase());
        }else {
            execution.setVariable("customerDataNew","myData");
            throw new BpmnError("NoData");
        }

    }
}
