package com.gson;
import com.google.gson.Gson;
import com.pojo.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Gson gson = new Gson();
        User user = new User("李明",24,"2515946609@qq.com");
        /*
        * toJson()：其转成 JSON 字符串
        * */
        String jsonObject = gson.toJson(user);
        //{"name":"李明","age":24,"emailAddress":"2515946609@qq.com"}
        System.out.println(jsonObject);
        /*
        * fromJson():将字符串 json 解析为 Java 对象。
        * */
        User user2=gson.fromJson(jsonObject, User.class);
        //User{name='李明', age=24, emailAddress='2515946609@qq.com'}
        System.out.println(user2);
        Map<String, Object> map = new HashMap<>();
        map.put("name", "小明");
        map.put("age", 30);
        map.put("address", "中国");
        map.put("sex", "boy");
        List<Map<String, Object>> list = new ArrayList<>();
        list.add(map);
        String s = new Gson().toJson(list);//生成jsonString
        //[{"address":"中国","sex":"boy","name":"小明","age":30}]
        System.out.println(s);




    }
}