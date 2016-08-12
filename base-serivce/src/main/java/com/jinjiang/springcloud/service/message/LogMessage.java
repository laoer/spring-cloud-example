package com.jinjiang.springcloud.service.message;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * Created by Laoer on 16/8/12.
 */
@EnableBinding(Sink.class)
public class LogMessage {

    @StreamListener(Sink.INPUT)
    public void logMessage(String message) {
        System.out.println(message);
    }

}
