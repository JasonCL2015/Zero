package com.jason.zero.utils;

import org.springframework.scheduling.annotation.Scheduled;


public class ScheduledTask {


    /**
     * 每10秒执行一次
     * @throws Exception
     */
    @Scheduled(cron = "0/10 * * * * ? ")
    public void syncVideoFromWms() throws Exception {
        String result = CommandUtil.exeCmd("ls -l");
        System.out.println(result);
    }

    


}
