package com.youjia.system.youplus.core.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author wuweifeng wrote on 2017/10/26.
 */
public interface PtGroundPersonRepository extends JpaRepository<PtGroundPerson, Long>,
        JpaSpecificationExecutor<PtGroundPerson> {

}
