import dao.SqlSessionHelper;
import dao.UserinfoDao;
import entity.Userinfo;
import org.apache.ibatis.session.SqlSession;


/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月04日 - 9:07
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test {
    public static void main(String[] args) {
        SqlSession session= SqlSessionHelper.getSqlSession();
        UserinfoDao dao=session.getMapper(UserinfoDao.class);
        Userinfo user= dao.findUser("吴文杰");
        System.out.println(user);
        session.close();
    }
}