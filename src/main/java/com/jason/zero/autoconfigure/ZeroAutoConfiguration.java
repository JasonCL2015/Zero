package com.jason.zero.autoconfigure;

import com.jason.zero.utils.ScheduledTask;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

/**
 * @Package com.jason.zero.autoconfigure
 * @author: wenyuan
 * @date: 2018/10/19 3:06 PM
 */
@PropertySource(
        name = "Zero Default Properties",
        value = "classpath:/META-INF/zero-default.properties")
public class ZeroAutoConfiguration {

    @Bean
    ScheduledTask scheduledTask() {
        return new ScheduledTask();
    }
}
