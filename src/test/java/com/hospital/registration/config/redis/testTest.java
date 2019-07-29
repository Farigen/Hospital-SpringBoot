package com.hospital.registration.config.redis;

import com.hospital.registration.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testTest {
    @Autowired
    RedisUtil redisUtil;

    @Test
    public void test(){
        redisUtil.set("test", "success");
        System.out.println(redisUtil.get("test"));
    }

}