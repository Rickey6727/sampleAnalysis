package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MGachaExchange;
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
public interface MGachaExchangeDao {

    /**
     * @param exchangeId
     * @return the MGachaExchange entity
     */
    @Select
    Optional<MGachaExchange> selectById(Integer exchangeId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGachaExchange entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGachaExchange entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGachaExchange entity);
}