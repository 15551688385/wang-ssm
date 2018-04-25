package com.base.ssm.service;


import com.base.ssm.common.PageReturn;
import com.base.ssm.common.Paginator;
import com.base.ssm.model.SsmUser;

public interface UserService extends BaseService<SsmUser>{
    SsmUser findByUserId(Integer userId);
    SsmUser findByUser(Integer userId);
    PageReturn userList(Paginator p);
}
