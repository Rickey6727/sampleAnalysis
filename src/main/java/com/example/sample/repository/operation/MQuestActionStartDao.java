package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MQuestActionStart;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MQuestActionStartDao {

    /**
     * @param questId
     * @return the MQuestActionStart entity
     */
    @Select
    MQuestActionStart selectById(Integer questId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MQuestActionStart entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MQuestActionStart entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MQuestActionStart entity);
}