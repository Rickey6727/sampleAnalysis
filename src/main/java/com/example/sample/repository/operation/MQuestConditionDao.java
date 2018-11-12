package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MQuestCondition;
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
public interface MQuestConditionDao {

    /**
     * @param conditionId
     * @param conditionNo
     * @return the MQuestCondition entity
     */
    @Select
    Optional<MQuestCondition> selectById(Integer conditionId, Integer conditionNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MQuestCondition entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MQuestCondition entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MQuestCondition entity);
}