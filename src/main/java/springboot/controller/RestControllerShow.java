package springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 这个是最基础也是常用的形式
 * 测试方法入口  http://localhost:8080/rest
 */
@RestController
@RequestMapping(value="/rest")
public class RestControllerShow {
    @RequestMapping(value="", method= RequestMethod.GET)
    public Map<String,String> RestData() {
        Map<String,String> data=new HashMap<String,String>();
        data.put("username","tianjian");
        data.put("password","tianjian");
        return data;
    }

}
