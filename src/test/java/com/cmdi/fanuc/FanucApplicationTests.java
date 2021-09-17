package com.cmdi.fanuc;

import com.cmdi.fanuc.mapper.UserMapper;
import com.cmdi.fanuc.mapper.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class FanucApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Test
    void contextLoads() {

        User u1 = new User();
        u1.setUsername("javaboy");
        u1.setPassword(passwordEncoder.encode("123"));
        u1.setEnable(true);
        u1.setRoles("ROLE_admin");
        userMapper.insert(u1);
        User u2 = new User();
        u2.setUsername("江南一点雨");
        u2.setPassword(passwordEncoder.encode("abc"));
        u2.setEnable(true);
        u2.setRoles("ROLE_user");
        userMapper.insert(u2);
    }

}
