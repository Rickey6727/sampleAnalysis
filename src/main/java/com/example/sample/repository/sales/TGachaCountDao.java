package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TGachaCount;
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
public interface TGachaCountDao {

    /**
     * @param accountId
     * @param gachaId
     * @return the TGachaCount entity
     */
    @Select
    Optional<TGachaCount> selectById(Integer accountId, Integer gachaId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGachaCount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGachaCount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGachaCount entity);
}