package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TGachaBoxCollection90;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TGachaBoxCollection90Dao {

    /**
     * @param accountId
     * @param gachaId
     * @param itemId
     * @param itemType
     * @return the TGachaBoxCollection90 entity
     */
    @Select
    TGachaBoxCollection90 selectById(Integer accountId, Integer gachaId, Integer itemId, Integer itemType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGachaBoxCollection90 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGachaBoxCollection90 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGachaBoxCollection90 entity);
}