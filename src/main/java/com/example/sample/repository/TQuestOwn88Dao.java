package com.example.sample.repository;

import com.example.sample.entity.TQuestOwn88;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TQuestOwn88Dao {

    /**
     * @param accountId
     * @param questId
     * @param conditionNo
     * @return the TQuestOwn88 entity
     */
    @Select
    TQuestOwn88 selectById(Integer accountId, Integer questId, Integer conditionNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TQuestOwn88 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TQuestOwn88 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TQuestOwn88 entity);
}