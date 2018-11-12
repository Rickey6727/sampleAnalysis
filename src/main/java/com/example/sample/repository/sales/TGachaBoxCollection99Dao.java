package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TGachaBoxCollection99;
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
public interface TGachaBoxCollection99Dao {

    /**
     * @param accountId
     * @param gachaId
     * @param itemId
     * @param itemType
     * @return the TGachaBoxCollection99 entity
     */
    @Select
    Optional<TGachaBoxCollection99> selectById(Integer accountId, Integer gachaId, Integer itemId, Integer itemType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGachaBoxCollection99 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGachaBoxCollection99 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGachaBoxCollection99 entity);
}