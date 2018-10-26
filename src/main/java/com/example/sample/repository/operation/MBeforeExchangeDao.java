package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MBeforeExchange;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MBeforeExchangeDao {

    /**
     * @param beforeExchangeId
     * @param no
     * @return the MBeforeExchange entity
     */
    @Select
    MBeforeExchange selectById(Integer beforeExchangeId, Integer no);

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