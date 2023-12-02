package com.example.myproject.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT COUNT(*) FROM myproject.users WHERE mailbox = #{mailbox}")
    int GetUserAccount(@Param("mailbox") String mailbox);
    @Select("SELECT password from myproject.users WHERE mailbox = #{mailbox}")
    String GetUserPassword(@Param("mailbox")String mailbox);
    @Insert("INSERT INTO users (mailbox, password) VALUES (#{mailbox}, #{password})")
    int InsertUser(@Param("mailbox") String mailbox, @Param("password") String password);
}
