package com.base.ssm.dao;

import com.base.ssm.model.SsmUser;
import tk.mybatis.mapper.common.Mapper;

public interface SsmUserMapper extends Mapper<SsmUser> {
    SsmUser findByUserId(Integer userId);
}