package  dao;



import entity.Resourcces;

import java.util.Date;
import java.util.List;

/**
 * Created by THINK on 2017/8/3.
 */
public interface ResourccesDao {
    public  List<Resourcces>  findAll ();
    public  Resourcces  findRid (int rid);
    public  Resourcces findRname (String rname);
    public  boolean insert(Resourcces Resourcces);
    public  boolean  delete(int rid);
    public  boolean  update(int rid);
    public  List< Resourcces> findResourccesByUid(int Uid);
}