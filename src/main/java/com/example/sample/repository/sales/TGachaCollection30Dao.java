package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TGachaCollection30;
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
public interface TGachaCollection30Dao {

    /**
     * @param accountId
     * @param gachaId
     * @param itemId
     * @param itemType
     * @param itemVal
     * @return the TGachaCollection30 entity
     */
    @Select
    Optional<TGachaCollection30> selectById(Integer accountId, Integer gachaId, Integer itemId, Integer itemType, Integer itemVal);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGachaCollection30 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGachaCollection30 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGachaCollection30 entity);
}