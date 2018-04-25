package com.base.ssm.service;


import com.base.ssm.common.PageList;
import com.base.ssm.common.Paginator;
import com.base.ssm.model.SsmUser;

public interface UserService {
    SsmUser findByUserId(Integer userId);
    SsmUser findByUser(Integer userId);
    PageList userList(Paginator p);
}
