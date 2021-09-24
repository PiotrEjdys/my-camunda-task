package pl.altkomsoftware.status;

import org.camunda.bpm.engine.delegate.DelegateTask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

public class StatusOfTask {

    private  final Logger LOGGER = Logger.getLogger(StatusOfTask.class.getName());
        public void getStatus(DelegateTask task){
            LocalDateTime localDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LOGGER.info(task.getEventName() + " " + task.getName()+ " " + localDateTime.format(formatter));
        }
}
