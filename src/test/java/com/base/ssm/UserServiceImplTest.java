package com.base.ssm;

import com.base.ssm.model.SsmUser;
import com.base.ssm.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplTest  extends UserDaoTest {
    @Autowired
    UserService userService;
    @Test
    public void findByUserId() {
        SsmUser user=userService.findByUserId(1);
        System.out.println(user.getEmail());
    }

}
