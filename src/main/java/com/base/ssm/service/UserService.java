package com.base.ssm.service;


import com.base.ssm.model.SsmUser;

public interface UserService {
    SsmUser findByUserId(Integer userId);
    SsmUser findByUser(Integer userId);
}
