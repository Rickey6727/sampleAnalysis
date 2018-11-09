package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TRushGachaCount;
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
public interface TRushGachaCountDao {

    /**
     * @param accountId
     * @param gachaId
     * @param gachaKind
     * @return the TRushGachaCount entity
     */
    @Select
    Optional<TRushGachaCount> selectById(Integer accountId, Integer gachaId, Integer gachaKind);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TRushGachaCount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TRushGachaCount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TRushGachaCount entity);
}