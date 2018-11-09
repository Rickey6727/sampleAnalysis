package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MBannerNameCountry;
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
public interface MBannerNameCountryDao {

    /**
     * @param bannerType
     * @param typeId
     * @param countryCd
     * @param displayOrder
     * @return the MBannerNameCountry entity
     */
    @Select
    Optional<MBannerNameCountry> selectById(Integer bannerType, Integer typeId, Integer countryCd, Integer displayOrder);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MBannerNameCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MBannerNameCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MBannerNameCountry entity);
}