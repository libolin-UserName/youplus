package com.youjia.system.youplus.core.company.goods;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author wuweifeng wrote on 2017/10/26.
 */
public interface PtGoodsTempRepository extends JpaRepository<PtGoodsTemp, Long>,
        JpaSpecificationExecutor<PtGoodsTemp> {

    PtGoodsTemp findFirstByGoodsIdOrderByIdDesc(Long goodsId);
}
