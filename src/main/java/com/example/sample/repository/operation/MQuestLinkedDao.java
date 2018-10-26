package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MQuestLinked;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MQuestLinkedDao {

    /**
     * @param questId
     * @param linkedQuestId
     * @return the MQuestLinked entity
     */
    @Select
    MQuestLinked selectById(Integer questId, Integer linkedQuestId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MQuestLinked entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MQuestLinked entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MQuestLinked entity);
}