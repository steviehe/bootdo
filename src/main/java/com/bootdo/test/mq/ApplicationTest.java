package com.bootdo.test.mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private Producer producer;

    @Test
    public void testActivemq(){
        producer.sendMessage("look this is a message==zycc==");
        while(true){}
    }
}
