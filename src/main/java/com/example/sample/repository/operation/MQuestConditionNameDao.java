package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MQuestConditionName;
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
public interface MQuestConditionNameDao {

    /**
     * @param conditionId
     * @param conditionNo
     * @param countryCd
     * @return the MQuestConditionName entity
     */
    @Select
    Optional<MQuestConditionName> selectById(Integer conditionId, Integer conditionNo, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MQuestConditionName entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MQuestConditionName entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MQuestConditionName entity);
}