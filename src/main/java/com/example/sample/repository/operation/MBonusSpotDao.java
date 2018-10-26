package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MBonusSpot;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MBonusSpotDao {

    /**
     * @param bonusId
     * @param bonusNo
     * @return the MBonusSpot entity
     */
    @Select
    MBonusSpot selectById(Integer bonusId, Integer bonusNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MBonusSpot entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MBonusSpot entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MBonusSpot entity);
}