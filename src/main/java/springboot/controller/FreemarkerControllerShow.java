package springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springboot.entity.User;

import java.util.Map;


/**
 * Created by Administrator on 2016/11/29.
 *
 * 应用freemarker需要pom文件引入对应的boot-start-freemarker包
 * 配置文件中添加属性样式如下
 * spring.freemarker.template-loader-path[0]=classpath:/templates/error/
 * spring.freemarker.template-loader-path[1]=classpath:/templates/service/
 * ect
 * 视图路径就是自动扫描路径加配置路径加返回的字符串的值后缀会自动识别
 * 测试方法入口数据是map方式  http://localhost:8080/login
 * 测试方法入口数据是对象方式 http://localhost:8080/entity
 * 请注意2个页面的差异自己先尝试理解
 */

//   http://localhost:8080

//Controller 是配置视图层的入口
@Controller
@RequestMapping(value="/login")
public class FreemarkerControllerShow {

    /*尽管是返回string其实根据我们的配置已经装配为模板了
    用普通的map封装数据
     */
    @RequestMapping(value="", method= RequestMethod.GET)
    public String Login(Map<String,Object> model) {
        model.put("username","tianjian");
        model.put("password","tianjian");
        return "freemarker/login";
    }


    @RequestMapping(value="check", method= RequestMethod.POST)
    public String LoginCheck(
           String username,
           String password
    ) {
        if(username.equals("zlj")&&password.equals("zlj"))
        return "freemarker/success";
        return "fail";
    }


    //用对象封装数据
    @RequestMapping(value="entity", method= RequestMethod.GET)
    public String entityGet(Map<String,Object> model) {
        User user=new User();
        user.setPassword("zlj");
        user.setUsername("zlj");
        model.put("user",user);
        return "freemarker/entity_login";
    }

    @RequestMapping(value="entity", method= RequestMethod.POST)
    public String entityPost(User user) {

        System.out.println(user.getUsername());
        if("tianjian".equals(user.getPassword())&&"tianjian".equals(user.getUsername()))
            return "freemarker/success";
        return "fail";
    }




}