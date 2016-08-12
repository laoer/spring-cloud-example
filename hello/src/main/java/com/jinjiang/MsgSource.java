package com.jinjiang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

/**
 * Created by Laoer on 16/8/12.
 */

@Service
@EnableBinding(Source.class)
public class MsgSource {

    @Output(Source.OUTPUT)
    @Autowired
    MessageChannel messageChannel;

    public void sendMessage(String msg) {
        this.messageChannel.send(MessageBuilder.withPayload("Msg : " + msg + " Time : " + System.currentTimeMillis()).build());
    }
}
