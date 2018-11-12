package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MBanner;
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
public interface MBannerDao {

    /**
     * @param bannerId
     * @return the MBanner entity
     */
    @Select
    Optional<MBanner> selectById(Integer bannerId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MBanner entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MBanner entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MBanner entity);
}