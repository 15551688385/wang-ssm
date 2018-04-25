package com.base.ssm.service.impl;

import com.base.ssm.common.PageList;
import com.base.ssm.common.Paginator;
import com.base.ssm.dao.SsmUserMapper;
import com.base.ssm.model.SsmUser;
import com.base.ssm.service.UserService;
import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private Logger log = Logger.getLogger(this.getClass());
    @Autowired
    private SsmUserMapper userMapper;
    @Override
    public SsmUser findByUserId(Integer userId) {
        return userMapper.findByUserId(userId);
    }

    @Override
    public SsmUser findByUser(Integer userId) {
        log.debug("---->>>>>>>>>log4j debug:"+userId);
        log.info("---->>>>>>>>>log4j info:"+userId);
        log.warn("---->>>>>>>>>log4j warn:"+userId);
        log.error("---->>>>>>>>log4j error:"+userId);
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public PageList userList(Paginator p) {
        PageHelper.startPage(p.getPageNum(), p.getPageSize());
        return new PageList(userMapper.selectAll());
    }
}
