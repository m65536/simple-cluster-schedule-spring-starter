package com.mo.schedule.circularize;

import com.alibaba.fastjson.JSON;
import com.mo.schedule.entity.MessageEvent;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @description:
 * @author: MoXingwang 2018-08-11 19:33
 **/
public class RedisMessageListenerStrategy implements MessageListener {
    private RedisTemplate redisTemplate;

    public RedisMessageListenerStrategy(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public void onMessage(Message message, byte[] bytes) {
        MessageEvent messageEvent = (MessageEvent) redisTemplate.getValueSerializer().deserialize(message.getBody());

        //添加任务通知

        System.out.println(JSON.toJSONString(messageEvent));
    }
}