package com.youjia.system.youplus.core.dict;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wuweifeng wrote on 2017/10/26.
 */
public interface PtDictRepository extends JpaRepository<PtDict, Long> {
    List<PtDict> findByGroupId(Integer groupId);
}
