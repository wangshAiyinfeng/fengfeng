package com.xiaoxiaofengsi.dao;

import com.xiaoxiaofengsi.entity.User;

/**
 * @Author: qingshan
 * @Description: 咕泡学院，只为更好的你
 */
public interface UserDao  {

    void addOne(User user);

    User getOneById(long id);
}
