package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MRaiseEventNpcReward;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MRaiseEventNpcRewardDao {

    /**
     * @param eventId
     * @param rare
     * @param groupNo
     * @param itemId
     * @return the MRaiseEventNpcReward entity
     */
    @Select
    MRaiseEventNpcReward selectById(Integer eventId, Short rare, Short groupNo, Integer itemId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MRaiseEventNpcReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MRaiseEventNpcReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MRaiseEventNpcReward entity);
}