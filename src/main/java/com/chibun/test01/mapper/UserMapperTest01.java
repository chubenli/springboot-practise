package com.chibun.test01.mapper;

import com.chibun.entry.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface UserMapperTest01 {

    @Select("select * from user where name=#{name}")
    User getUserByName(@Param("name") String name);

    @Insert("insert into user values (null,#{name}, #{age})")
    int addUser(@Param("name") String name, @Param("age") Integer age);
}
