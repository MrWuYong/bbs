package com.wh.usermanger;

import com.wh.usermanger.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsermangerApplicationTests {
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {

    }

}
