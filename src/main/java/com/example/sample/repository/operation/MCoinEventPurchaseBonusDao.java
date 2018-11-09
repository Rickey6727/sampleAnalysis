package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MCoinEventPurchaseBonus;
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
public interface MCoinEventPurchaseBonusDao {

    /**
     * @param eventId
     * @param productId
     * @param itemType
     * @param itemId
     * @return the MCoinEventPurchaseBonus entity
     */
    @Select
    Optional<MCoinEventPurchaseBonus> selectById(Integer eventId, String productId, Integer itemType, Integer itemId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MCoinEventPurchaseBonus entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MCoinEventPurchaseBonus entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MCoinEventPurchaseBonus entity);
}