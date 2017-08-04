package test;

import dao.ResourccesDao;
import dao.SqlSessionHelper;
import entity.Resourcces;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年08月04日 - 9:42
 * |    @description   测试类
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMapper {
    public static void main(String[] args) {
        Logger log= Logger.getLogger("TestMapper");
        SqlSession session= SqlSessionHelper.getSqlSession();
        ResourccesDao res=session.getMapper(ResourccesDao.class);
        List<Resourcces> list=res.findResourccesByUid(1);
        for(Resourcces obj:list){
            log.debug(obj);

        }

    }
}
