package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MPresentMessage;
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
public interface MPresentMessageDao {

    /**
     * @param messageId
     * @param countryCd
     * @return the MPresentMessage entity
     */
    @Select
    Optional<MPresentMessage> selectById(Integer messageId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MPresentMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MPresentMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MPresentMessage entity);
}