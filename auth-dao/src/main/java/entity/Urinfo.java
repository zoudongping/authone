package entity;

/**
 * Created by Administrator on 2017/8/3.
 */
public class Urinfo {
    private  Integer uid;
    private  Integer rid;

    public Integer getuId() {
        return uid;
    }

    public void setuId(Integer uId) {
        this.uid = uId;
    }

    public Integer getrId() {
        return rid;
    }

    public void setrId(Integer rId) {
        this.rid = rId;
    }

    @Override
    public String toString() {
        return "Urinfo{" +
                "uid=" + uid +
                ", rid=" + rid +
                '}';
    }
}
