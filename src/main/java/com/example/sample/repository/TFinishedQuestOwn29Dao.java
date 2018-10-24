package com.example.sample.repository;

import com.example.sample.entity.TFinishedQuestOwn29;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TFinishedQuestOwn29Dao {

    /**
     * @param accountId
     * @param questId
     * @param conditionNo
     * @return the TFinishedQuestOwn29 entity
     */
    @Select
    TFinishedQuestOwn29 selectById(Integer accountId, Integer questId, Integer conditionNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TFinishedQuestOwn29 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TFinishedQuestOwn29 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TFinishedQuestOwn29 entity);
}