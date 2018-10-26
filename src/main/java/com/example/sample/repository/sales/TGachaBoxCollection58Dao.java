package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TGachaBoxCollection58;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TGachaBoxCollection58Dao {

    /**
     * @param accountId
     * @param gachaId
     * @param itemId
     * @param itemType
     * @return the TGachaBoxCollection58 entity
     */
    @Select
    TGachaBoxCollection58 selectById(Integer accountId, Integer gachaId, Integer itemId, Integer itemType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGachaBoxCollection58 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGachaBoxCollection58 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGachaBoxCollection58 entity);
}