package entity;

/**
 * Created by 李晨曦 2017年08月07日
 */
public class WeixinInfo {
    private int weixinhao;
    private String weixinnicheng;
    private String weixinimage;

    public int getWeixinhao() {
        return weixinhao;
    }

    @Override
    public String toString() {
        return "WeixinInfo{" +
                "weixinhao=" + weixinhao +
                ", weixinnicheng='" + weixinnicheng + '\'' +
                ", weixinimage='" + weixinimage + '\'' +
                '}';
    }

    public void setWeixinhao(int weixinhao) {
        this.weixinhao = weixinhao;
    }

    public String getWeixinnicheng() {
        return weixinnicheng;
    }

    public void setWeixinnicheng(String weixinnicheng) {
        this.weixinnicheng = weixinnicheng;
    }

    public String getWeixinimage() {
        return weixinimage;
    }

    public void setWeixinimage(String weixinimage) {
        this.weixinimage = weixinimage;
    }
}
