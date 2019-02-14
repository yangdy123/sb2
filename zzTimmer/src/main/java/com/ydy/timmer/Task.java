package com.ydy.timmer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * scheduled 定时任务类
 * Created by Fant.J.
 */

@Component
public class Task {

    @Scheduled(cron = "5 0 0 * * ?")
    public void scheduledTask1(){
        System.out.println("scheduledTask method 1 run..");
    }

    @Scheduled(initialDelay =  1000 * 10,fixedDelay = 1000 * 5)
    public void scheduledTask2(){
        System.out.println("scheduledTask method 2 run..");
    }

    @Scheduled(initialDelay =  1000 * 10,fixedDelay = 1000 * 5)
    public void test() throws Exception {
        for (int i = 0;i<3;i++){
//            new MailSender()
//                    .title("FantJ给你发送的邮件")
//                    .content("嘻嘻")
//                    .contentType(MailContentTypeEnum.TEXT)
//                    .targets(new ArrayList<String>(){{
//                        add("xxxxxx@qq.com");
//                    }})
//                    .send();
            System.out.println("第"+i+"次发送成功!");
        }
    }
}