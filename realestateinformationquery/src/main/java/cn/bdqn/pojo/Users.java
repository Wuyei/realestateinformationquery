package cn.bdqn.pojo;

import java.math.BigInteger;
import java.util.Date;

public class Users {
    private BigInteger cardId;      //身份证号
    private String name;        //用户名
    private Integer gender;      //性别 身份证第17位判断 单数男 双数女
    private Date createTime;    //注册时间
    private String passwrod;        //密码 6位及以上
    private Integer status;     //用户状态 1正常，0冻结 默认1
    public BigInteger getCardId() {
        return cardId;
    }
    public void setCardId(BigInteger cardId) {
        this.cardId = cardId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getGender() {
        return gender;
    }
    public void setGender(Integer gender) {
        this.gender = gender;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String getPasswrod() {
        return passwrod;
    }
    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Users [cardId=" + cardId + ", name=" + name + ", gender=" + gender + ", createTime=" + createTime
                + ", passwrod=" + passwrod + ", status=" + status + "]";
    }
}
