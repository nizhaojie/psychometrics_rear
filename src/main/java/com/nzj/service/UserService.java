package com.nzj.service;

import com.nzj.pojo.User;

import java.util.List;

public interface UserService {
    //根据用户名查询用户
    User findByUserName(String username);

    List<User> findByOrganization(String organization);

    //注册
    void register(String username, String password, String organization);

    //更新
    void update(User user);

    //更新头像
    void updateAvatar(String avatarUrl);

    //更新密码
    void updatePwd(String newPwd);
}
