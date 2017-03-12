package com.bjm.DAO;

import com.bjm.pojo.User;

/**
 * Created by bjming on 17-2-9.
 */
public interface UserDAO {
    Boolean save(User user);//添加用户
    User findyById(int id);//根据用户标识查找指定用户
    Boolean delete(User user);//删除用户
    void update(User user);//修改用户信息
}
