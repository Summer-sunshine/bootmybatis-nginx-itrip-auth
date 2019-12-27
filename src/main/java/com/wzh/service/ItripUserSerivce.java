package com.wzh.service;

import com.wzh.po.ItripUser;

public interface ItripUserSerivce {
    //判断用户是否存在
    public ItripUser findByUserCode(ItripUser user);
    //增加新用户
    public  int codeUserSave(ItripUser user);
    //修改用户激活状态
    public int upadteUserActivated(ItripUser user);
    //用户登录查找
    public ItripUser doLogin(ItripUser user);
}
