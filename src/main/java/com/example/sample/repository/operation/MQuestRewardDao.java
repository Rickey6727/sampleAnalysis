package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MQuestReward;
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
public interface MQuestRewardDao {

    /**
     * @param questId
     * @param questNo
     * @return the MQuestReward entity
     */
    @Select
    Optional<MQuestReward> selectById(Integer questId, Integer questNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MQuestReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MQuestReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MQuestReward entity);
}