package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MRaiseEventResultReward;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MRaiseEventResultRewardDao {

    /**
     * @param eventId
     * @param itemNo
     * @return the MRaiseEventResultReward entity
     */
    @Select
    MRaiseEventResultReward selectById(Integer eventId, Integer itemNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MRaiseEventResultReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MRaiseEventResultReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MRaiseEventResultReward entity);
}