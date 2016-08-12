package com.jinjiang.springcloud.service.message;

import com.jinjiang.HelloMsg;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

/**
 * Created by Laoer on 16/8/12.
 */
@EnableBinding(Sink.class)
public class LogMessage {

    @StreamListener(Sink.INPUT)
    public void logMessage(HelloMsg message) {
        System.out.print(message.toString());
    }

}