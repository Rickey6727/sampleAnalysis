package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MAndroidAppVersion;
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
public interface MAndroidAppVersionDao {

    /**
     * @param appVersion
     * @return the MAndroidAppVersion entity
     */
    @Select
    Optional<MAndroidAppVersion> selectById(Float appVersion);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MAndroidAppVersion entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MAndroidAppVersion entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MAndroidAppVersion entity);
}