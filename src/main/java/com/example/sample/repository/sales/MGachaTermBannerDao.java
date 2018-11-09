package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MGachaTermBanner;
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
public interface MGachaTermBannerDao {

    /**
     * @param gachaId
     * @param countryCd
     * @param termNo
     * @return the MGachaTermBanner entity
     */
    @Select
    Optional<MGachaTermBanner> selectById(Integer gachaId, Integer countryCd, Integer termNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGachaTermBanner entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGachaTermBanner entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGachaTermBanner entity);
}