package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MQuestMessage;
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
public interface MQuestMessageDao {

    /**
     * @param questId
     * @return the MQuestMessage entity
     */
    @Select
    Optional<MQuestMessage> selectById(Integer questId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MQuestMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MQuestMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MQuestMessage entity);
}