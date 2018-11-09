package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MIpEnable;
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
public interface MIpEnableDao {

    /**
     * @param ipEventId
     * @param enableIsoCountryCd
     * @return the MIpEnable entity
     */
    @Select
    Optional<MIpEnable> selectById(Integer ipEventId, String enableIsoCountryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MIpEnable entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MIpEnable entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MIpEnable entity);
}