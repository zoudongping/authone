package entity;

/**
 * Created by 李晨曦 2017年08月03日
 */
public class Userinfo {
    private int uid;
    private String uname;
    private String upass;
    private String ustatus;
    private String createTime;

    @Override
    public String toString() {
        return "Userinfo{" +
                "uid=" + uid +
                ", createTime='" + createTime + '\'' +
                ", uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }
}
