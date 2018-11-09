package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MExchangeMessage;
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
public interface MExchangeMessageDao {

    /**
     * @param messageType
     * @return the MExchangeMessage entity
     */
    @Select
    Optional<MExchangeMessage> selectById(Integer messageType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MExchangeMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MExchangeMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MExchangeMessage entity);
}