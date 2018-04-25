package com.base.ssm;

import com.base.ssm.dao.SsmUserMapper;
import com.base.ssm.model.SsmUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends BaseTest {
    @Autowired
    private SsmUserMapper userMapper;
    @Test
    public void findByUserId() {
        SsmUser user=userMapper.findByUserId(1);
        System.out.println(user.getEmail());
    }
    @Test
    public void findByUser() {
        SsmUser user=userMapper.selectByPrimaryKey(1);
        System.out.println(user.getEmail());
    }
    @Test
    public void addUser() {
        SsmUser user=new SsmUser();
        user.setUsername("飞扬");
        user.setPassword("123456");
        user.setEmail("feiyang@163.com");
        userMapper.insert(user);

    }
}
