package com.example.sample.repository;

import com.example.sample.entity.TQuestOwn35;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TQuestOwn35Dao {

    /**
     * @param accountId
     * @param questId
     * @param conditionNo
     * @return the TQuestOwn35 entity
     */
    @Select
    TQuestOwn35 selectById(Integer accountId, Integer questId, Integer conditionNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TQuestOwn35 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TQuestOwn35 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TQuestOwn35 entity);
}