package com.example.sample.repository;

import com.example.sample.entity.TFinishedQuestOwn93;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TFinishedQuestOwn93Dao {

    /**
     * @param accountId
     * @param questId
     * @param conditionNo
     * @return the TFinishedQuestOwn93 entity
     */
    @Select
    TFinishedQuestOwn93 selectById(Integer accountId, Integer questId, Integer conditionNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TFinishedQuestOwn93 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TFinishedQuestOwn93 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TFinishedQuestOwn93 entity);
}