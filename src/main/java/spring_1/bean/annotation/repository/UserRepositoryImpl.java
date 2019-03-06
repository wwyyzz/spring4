package spring_1.bean.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * @program: spring4
 * @description: impl
 * @author: Jun Wang
 * @create: 2019-03-06 15:43
 */
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository{

    public void save() {
        System.out.println("UserRepository Save...");
    }
}
