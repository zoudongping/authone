package Test;

import dao.RoleInfoDao;
import dao.SqlSessionHelper;
import entity.RoleInfo;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年08月03日 - 18:06
 * |  @description   测试角色类
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class TestRoleInfoDao {
    public static void main(String[] args) {
        SqlSession session= SqlSessionHelper.getSqlSession();
        RoleInfoDao test=session.getMapper(dao.RoleInfoDao.class);
        List<RoleInfo> list=test.findAll();
        for(RoleInfo roleinfo:list){
            System.out.println(roleinfo);
        }
        session.close();
    }
}
