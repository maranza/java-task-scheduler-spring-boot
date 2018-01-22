package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    
    //we use the logger factory to log the ScheduledTasks class
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    
    //initializing the prefered date format
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    
    //the scheduled task exaple here is time reporting every 5 seconds this can be any task.
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}