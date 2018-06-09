package com.chibun.mapper;

import com.chibun.entry.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {

    @Select("select * from user where name=#{name}")
    User getUserByName(@Param("name") String name);

    @Insert("insert into user values (null,#{name}, #{age})")
    int adduser(@Param("name") String name, @Param("age") Integer age);
}
