package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MRaiseEventReward;
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
public interface MRaiseEventRewardDao {

    /**
     * @param eventId
     * @param lotGroupId
     * @param itemId
     * @return the MRaiseEventReward entity
     */
    @Select
    Optional<MRaiseEventReward> selectById(Integer eventId, Integer lotGroupId, Integer itemId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MRaiseEventReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MRaiseEventReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MRaiseEventReward entity);
}