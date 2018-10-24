package com.example.sample.repository;

import com.example.sample.entity.TFinishedQuestOwn79;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TFinishedQuestOwn79Dao {

    /**
     * @param accountId
     * @param questId
     * @param conditionNo
     * @return the TFinishedQuestOwn79 entity
     */
    @Select
    TFinishedQuestOwn79 selectById(Integer accountId, Integer questId, Integer conditionNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TFinishedQuestOwn79 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TFinishedQuestOwn79 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TFinishedQuestOwn79 entity);
}