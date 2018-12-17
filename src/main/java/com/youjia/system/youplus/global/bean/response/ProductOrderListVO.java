package com.youjia.system.youplus.global.bean.response;

/**
 * 派单列表页
 * @author wuweifeng wrote on 2018/12/11.
 */
public class ProductOrderListVO {
    private Long id;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 电话号码
     */
    private String mobile;
    private String provinceValue;
    private String cityValue;
    private String countryValue;
    /**
     * 医院名 TODO
     */
    private String hospitalName;
    /**
     * 接单人 TODO
     */
    private String groundPersonName;
    /**
     * 公司名字 TODO
     */
    private String companyName;
    /**
     * 当前状态group=14.未派单，已派单，已接单，
     */
    private String stateValue;
    /**
     * 子状态group=15。已转单，未转单
     */
    private String childStateValue;
    private String remark;

    @Override
    public String toString() {
        return "ProductOrderListVO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", provinceValue='" + provinceValue + '\'' +
                ", cityValue='" + cityValue + '\'' +
                ", countryValue='" + countryValue + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", groundPersonName='" + groundPersonName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", stateValue='" + stateValue + '\'' +
                ", childStateValue='" + childStateValue + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public String getProvinceValue() {
        return provinceValue;
    }

    public void setProvinceValue(String provinceValue) {
        this.provinceValue = provinceValue;
    }

    public String getCityValue() {
        return cityValue;
    }

    public void setCityValue(String cityValue) {
        this.cityValue = cityValue;
    }

    public String getCountryValue() {
        return countryValue;
    }

    public void setCountryValue(String countryValue) {
        this.countryValue = countryValue;
    }

    public String getStateValue() {
        return stateValue;
    }

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    public String getChildStateValue() {
        return childStateValue;
    }

    public void setChildStateValue(String childStateValue) {
        this.childStateValue = childStateValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getGroundPersonName() {
        return groundPersonName;
    }

    public void setGroundPersonName(String groundPersonName) {
        this.groundPersonName = groundPersonName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}