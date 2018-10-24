package com.jason.zero.autoconfigure;

import com.jason.zero.utils.ScheduledTask;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;


/**
 * The type Zero auto configuration.
 */
@PropertySource(
        name = "Zero Default Properties",
        value = "classpath:/META-INF/zero-default.properties")
public class ZeroAutoConfiguration {

    /**
     * Scheduled task scheduled task.
     *
     * @return the scheduled task
     */
    @Bean
    ScheduledTask scheduledTask() {
        return new ScheduledTask();
    }
}
