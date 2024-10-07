package com.pig4cloud.ai.langchain4j02chatapi;

import com.pig4cloud.ai.langchain4j05chatvision.config.service.ChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChatAssistantTest {

    @Autowired
    private ChatAssistant chatAssistant;

    @Test
    void chat() {

        String chat = chatAssistant.chat("hello");

        System.out.println(chat);
    }
}