package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MQuest;
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
public interface MQuestDao {

    /**
     * @param questId
     * @return the MQuest entity
     */
    @Select
    Optional<MQuest> selectById(Integer questId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MQuest entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MQuest entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MQuest entity);
}