package com.youjia.system.youplus.core.company.goods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.youjia.system.youplus.core.base.BaseDeleteEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 商品计划
 * @author wuweifeng wrote on 2018/11/16.
 */
@Entity
@Table(name = "pt_goods_plan")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public class PtGoodsPlan extends BaseDeleteEntity {
    /**
     * 计划名字
     */
    private String name;
    /**
     * 属于哪个企业
     */
    private Long companyId;

    @Override
    public String toString() {
        return "PtGoodsPlan{" +
                "name='" + name + '\'' +
                ", companyId=" + companyId +
                '}';
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
