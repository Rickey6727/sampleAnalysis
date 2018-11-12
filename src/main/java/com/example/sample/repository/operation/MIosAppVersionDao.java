package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MIosAppVersion;
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
public interface MIosAppVersionDao {

    /**
     * @param appVersion
     * @return the MIosAppVersion entity
     */
    @Select
    Optional<MIosAppVersion> selectById(Float appVersion);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MIosAppVersion entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MIosAppVersion entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MIosAppVersion entity);
}