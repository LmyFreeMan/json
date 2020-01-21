package com.jackson;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.User;
import java.io.IOException;
import java.util.HashMap;

public class Test {
    public static void main(String[] args)  {
        User user = new User("李明",24,"2515946609@qq.com");
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = null;
        try {
            //返回字符串
            jsonString = mapper.writeValueAsString(user);
            //{"name":"李明","age":24,"emailAddress":"2515946609@qq.com"}
            System.out.println(jsonString);
            //输出格式化后的字符串(有性能损耗)
          //  jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
             /*
            {
                "name" : "李明",
                "age" : 24,
                "emailAddress" : "2515946609@qq.com"
            }
            */
           // System.out.println(jsonString);
            //转化为User对象
            User newUser = mapper.readValue(jsonString, User.class);
           // User{name='李明', age=24, emailAddress='2515946609@qq.com'}
            System.out.println(newUser);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}