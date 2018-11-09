package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MBeforeExchange;
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
public interface MBeforeExchangeDao {

    /**
     * @param beforeExchangeId
     * @param no
     * @return the MBeforeExchange entity
     */
    @Select
    Optional<MBeforeExchange> selectById(Integer beforeExchangeId, Integer no);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MBeforeExchange entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MBeforeExchange entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MBeforeExchange entity);
}