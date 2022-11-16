package com.ihjycc.mapper;

import com.ihjycc.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {


@Select("select * from tb_user where password =#{password} and username = #{username}")
    User select(@Param("username") String username, @Param("password") String password);
}
