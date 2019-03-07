package spring_1.bean.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import spring_1.bean.annotation.repository.UserRepository;

/**
 * @program: spring4
 * @description: service
 * @author: Jun Wang
 * @create: 2019-03-06 15:46
 */
@Service
public class UserService {
    @Autowired
    @Qualifier("userRepositoryImpl")
    private UserRepository userRepository;

    public void add(){

        System.out.println("UserService add..." );
        userRepository.save();
    }
}
