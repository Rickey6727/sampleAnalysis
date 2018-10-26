package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MCodeExchange;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MCodeExchangeDao {

    /**
     * @param targetFlg
     * @return the MCodeExchange entity
     */
    @Select
    MCodeExchange selectById(Integer targetFlg);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MCodeExchange entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MCodeExchange entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MCodeExchange entity);
}