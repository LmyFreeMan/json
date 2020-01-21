package com.fastjson;

import com.alibaba.fastjson.JSON;
import com.pojo.User;

public class Test {
    public static void main(String[] args) {
        User user = new User("李明",24,"2515946609@qq.com");
        String jsonString = JSON.toJSONString(user);
        //{"age":24,"emailAddress":"2515946609@qq.com","name":"李明"}
        System.out.println(jsonString);
        User u = JSON.parseObject(jsonString,User.class);
        //User{name='李明', age=24, emailAddress='2515946609@qq.com'}
        System.out.println(u);


    }
}