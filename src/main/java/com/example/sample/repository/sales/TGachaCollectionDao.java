package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TGachaCollection;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TGachaCollectionDao {

    /**
     * @param accountId
     * @param gachaId
     * @param itemId
     * @param itemType
     * @param itemVal
     * @return the TGachaCollection entity
     */
    @Select
    TGachaCollection selectById(Integer accountId, Integer gachaId, Integer itemId, Integer itemType, Integer itemVal);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGachaCollection entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGachaCollection entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGachaCollection entity);
}