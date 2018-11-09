package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TAdGacha;
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
public interface TAdGachaDao {

    /**
     * @param accountId
     * @return the TAdGacha entity
     */
    @Select
    Optional<TAdGacha> selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TAdGacha entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TAdGacha entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TAdGacha entity);
}