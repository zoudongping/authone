package dao;

import entity.RoleInfo;

import java.util.List;

public interface RoleInfoDao {
    public int insertRoleInfo(RoleInfo roleInfo);
    public int deleteRoleInfo(int rid);
    public int updateRoleInfo(RoleInfo roleInfo);
    public List<RoleInfo> findAll();
    public List<RoleInfo> findByRid(int rid);
    public List<RoleInfo> findByRname(String rname);
}
