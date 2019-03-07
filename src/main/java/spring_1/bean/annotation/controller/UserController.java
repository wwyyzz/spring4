package spring_1.bean.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spring_1.bean.annotation.service.UserService;

/**
 * @program: spring4
 * @description: a
 * @author: Jun Wang
 * @create: 2019-03-06 15:47
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService ;

    public void execute(){
        System.out.println("UserController execute...");
        userService.add();
    }
}
