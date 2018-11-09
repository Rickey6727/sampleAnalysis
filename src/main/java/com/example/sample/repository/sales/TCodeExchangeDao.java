package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TCodeExchange;
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
public interface TCodeExchangeDao {

    /**
     * @param exchangeCd
     * @param targetFlg
     * @return the TCodeExchange entity
     */
    @Select
    Optional<TCodeExchange> selectById(String exchangeCd, Integer targetFlg);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TCodeExchange entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TCodeExchange entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TCodeExchange entity);
}