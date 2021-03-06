package com.youjia.system.youplus.core.company.goods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.youjia.system.youplus.core.base.BaseDeleteEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 商品
 *
 * @author wuweifeng wrote on 2018/11/16.
 */
@Entity
@Table(name = "pt_goods_temp")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public class PtGoodsTemp extends BaseDeleteEntity {
    /**
     * 对应compnay的主键
     */
    private Long goodsId;
    /**
     * 修改原因
     */
    private String reason;
    /**
     * 操作类型（新建，修改，下架）
     */
    private String operatorType;
    ///////////// PtGoods ///////////////////////////////////
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品计划ID
     */
    private Long ptGoodsPlanId;
    /**
     * 商品生效时间
     */
    private Date beginTime;
    /**
     * 失效时间
     */
    private Date endTime;
    /**
     * 状态（-1待审核，0正常，-2被拒绝）
     */
    private Integer status;
    private String remark;

    private Long companyId;

    /**
     * 押金垫付
     */
    private Long youCashPrePayId;
    /**
     * 电话医生
     */
    private Long youPhoneDoctorId;
    /**
     * 体检服务
     */
    private Integer youBodyCheck;
    /**
     * 门诊绿通
     */
    private Integer youOutpatient;
    /**
     * 住院绿通
     */
    private Integer youHospital;
    /**
     * 手术绿通
     */
    private Integer youOperation;
    /**
     * 二次诊疗
     */
    private Integer youSecondMed;

    @Override
    public String toString() {
        return "PtGoodsTemp{" +
                "goodsId=" + goodsId +
                ", reason='" + reason + '\'' +
                ", operatorType='" + operatorType + '\'' +
                ", name='" + name + '\'' +
                ", ptGoodsPlanId=" + ptGoodsPlanId +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", status=" + status +
                ", remark='" + remark + '\'' +
                ", companyId=" + companyId +
                ", youCashPrePayId=" + youCashPrePayId +
                ", youPhoneDoctorId=" + youPhoneDoctorId +
                ", youBodyCheck=" + youBodyCheck +
                ", youOutpatient=" + youOutpatient +
                ", youHospital=" + youHospital +
                ", youOperation=" + youOperation +
                ", youSecondMed=" + youSecondMed +
                '}';
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getYouCashPrePayId() {
        return youCashPrePayId;
    }

    public void setYouCashPrePayId(Long youCashPrePayId) {
        this.youCashPrePayId = youCashPrePayId;
    }

    public Long getYouPhoneDoctorId() {
        return youPhoneDoctorId;
    }

    public void setYouPhoneDoctorId(Long youPhoneDoctorId) {
        this.youPhoneDoctorId = youPhoneDoctorId;
    }

    public Integer getYouBodyCheck() {
        return youBodyCheck;
    }

    public void setYouBodyCheck(Integer youBodyCheck) {
        this.youBodyCheck = youBodyCheck;
    }

    public Integer getYouOutpatient() {
        return youOutpatient;
    }

    public void setYouOutpatient(Integer youOutpatient) {
        this.youOutpatient = youOutpatient;
    }

    public Integer getYouHospital() {
        return youHospital;
    }

    public void setYouHospital(Integer youHospital) {
        this.youHospital = youHospital;
    }

    public Integer getYouOperation() {
        return youOperation;
    }

    public void setYouOperation(Integer youOperation) {
        this.youOperation = youOperation;
    }

    public Integer getYouSecondMed() {
        return youSecondMed;
    }

    public void setYouSecondMed(Integer youSecondMed) {
        this.youSecondMed = youSecondMed;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPtGoodsPlanId() {
        return ptGoodsPlanId;
    }

    public void setPtGoodsPlanId(Long ptGoodsPlanId) {
        this.ptGoodsPlanId = ptGoodsPlanId;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public String getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
