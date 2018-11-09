package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MIpEvent;
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
public interface MIpEventDao {

    /**
     * @param ipEventId
     * @return the MIpEvent entity
     */
    @Select
    Optional<MIpEvent> selectById(Integer ipEventId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MIpEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MIpEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MIpEvent entity);
}