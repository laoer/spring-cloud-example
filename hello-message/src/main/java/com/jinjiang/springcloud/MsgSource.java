package com.jinjiang.springcloud;

import com.jinjiang.HelloMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

/**
 * Created by Laoer on 16/8/14.
 */
@Service
@EnableBinding(Source.class)
public class MsgSource {

    @Output(Source.OUTPUT)
    @Autowired
    MessageChannel messageChannel;

    public void sendMessage(HelloMsg helloMsg) {
        this.messageChannel.send(MessageBuilder.withPayload(helloMsg).build());
    }

}
