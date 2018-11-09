package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MGachaExchangeColor;
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
public interface MGachaExchangeColorDao {

    /**
     * @param gachaId
     * @return the MGachaExchangeColor entity
     */
    @Select
    Optional<MGachaExchangeColor> selectById(Integer gachaId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGachaExchangeColor entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGachaExchangeColor entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGachaExchangeColor entity);
}