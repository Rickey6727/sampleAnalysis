package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MBannerGachaEvent;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 */
@ConfigAutowireable
@Dao(config = DomaConfig.class)
public interface MBannerGachaEventDao {

    /**
     * @param gachaId
     * @param displayOrder
     * @return the MBannerGachaEvent entity
     */
    @Select
    Optional<MBannerGachaEvent> selectById(Integer gachaId, Integer displayOrder);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MBannerGachaEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MBannerGachaEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MBannerGachaEvent entity);
}