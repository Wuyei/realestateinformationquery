package cn.bdqn.pojo;

import java.util.Date;

public class RealEstate {
    private Integer id;     //房产id
    private String cardId;     //产权人身份证号
    private String projectName;     //项目名称
    private String address;         //具体位置
    private String houseType;       //房屋类型
    private Integer area;           //使用面积
    private Date buildTime;         //建行时间
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getHouseType() {
        return houseType;
    }
    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }
    public Integer getArea() {
        return area;
    }
    public void setArea(Integer area) {
        this.area = area;
    }
    public Date getBuildTime() {
        return buildTime;
    }
    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }
    
    public String getCardId() {
        return cardId;
    }
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
    @Override
    public String toString() {
        return "RealEstate [id=" + id + ", cardId=" + cardId + ", projectName=" + projectName + ", address=" + address
                + ", houseType=" + houseType + ", area=" + area + ", buildTime=" + buildTime + "]";
    }
}
