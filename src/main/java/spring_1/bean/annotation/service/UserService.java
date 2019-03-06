package spring_1.bean.annotation.service;

import org.springframework.stereotype.Service;

/**
 * @program: spring4
 * @description: service
 * @author: Jun Wang
 * @create: 2019-03-06 15:46
 */
@Service
public class UserService {

    public void add(){
        System.out.println("UserService add..." );
    }
}
