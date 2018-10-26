package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MEventCheerReward;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MEventCheerRewardDao {

    /**
     * @param eventId
     * @param showActionType
     * @return the MEventCheerReward entity
     */
    @Select
    MEventCheerReward selectById(Integer eventId, Integer showActionType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MEventCheerReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MEventCheerReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MEventCheerReward entity);
}