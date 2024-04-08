package com.nzj.mapper;

import com.nzj.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {
    //根据用户名查询用户
    @Select("select * from user where username=#{username}")
    User findByUserName(String username);

    @Select("select * from user where organization=#{organization} and administrator=0")
    List<User> findByOrganization(String organization);

    //添加
    @Insert("insert into user(username,password,organization)" +
            " values(#{username},#{password},#{organization})")
    void add(String username, String password, String organization);

    @Update("update user set nickname=#{nickname},email=#{email} where id=#{id}")
    void update(User user);

    @Update("update user set user_pic=#{avatarUrl} where id=#{id}")
    void updateAvatar(String avatarUrl,Integer id);

    @Update("update user set password=#{md5String} where id=#{id}")
    void updatePwd(String md5String, Integer id);
}
