package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MQuestRewardSale;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MQuestRewardSaleDao {

    /**
     * @param questId
     * @param shopId
     * @param goodsId
     * @return the MQuestRewardSale entity
     */
    @Select
    MQuestRewardSale selectById(Integer questId, Integer shopId, Integer goodsId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MQuestRewardSale entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MQuestRewardSale entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MQuestRewardSale entity);
}