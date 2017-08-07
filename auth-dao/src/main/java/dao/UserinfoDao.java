package dao;

import entity.UserInfoVo;
import entity.Userinfo;

import java.util.List;

/**
 * Created by 李晨曦 on 2017/8/3.
 */
public interface UserinfoDao {
    public int insertuser(Userinfo userinfo) ;
    public Userinfo findUser(String uname);
    public boolean updatePwd(String uname, String oldpwd, String newpwd);
    public int deleteuser(String uname);
    public Userinfo findByUser(Userinfo userinfo);
    public List<UserInfoVo> findAllUser();
    public Userinfo findUserByUserId(int uid);
}
