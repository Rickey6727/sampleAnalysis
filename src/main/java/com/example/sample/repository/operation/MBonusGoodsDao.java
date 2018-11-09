package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MBonusGoods;
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
public interface MBonusGoodsDao {

    /**
     * @param bonusId
     * @param bonusNo
     * @return the MBonusGoods entity
     */
    @Select
    Optional<MBonusGoods> selectById(Integer bonusId, Integer bonusNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MBonusGoods entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MBonusGoods entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MBonusGoods entity);
}