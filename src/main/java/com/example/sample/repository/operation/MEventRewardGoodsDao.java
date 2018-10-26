package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MEventRewardGoods;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MEventRewardGoodsDao {

    /**
     * @param eventId
     * @param goodsGroupId
     * @param goodsLotNo
     * @return the MEventRewardGoods entity
     */
    @Select
    MEventRewardGoods selectById(Integer eventId, Integer goodsGroupId, Integer goodsLotNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MEventRewardGoods entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MEventRewardGoods entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MEventRewardGoods entity);
}