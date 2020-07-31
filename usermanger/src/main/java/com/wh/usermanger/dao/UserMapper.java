package com.wh.usermanger.dao;

import com.wh.usermanger.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {
    User selectUserById(int id);
}
