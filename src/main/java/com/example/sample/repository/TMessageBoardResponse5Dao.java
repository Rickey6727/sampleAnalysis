package com.example.sample.repository;

import com.example.sample.entity.TMessageBoardResponse5;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoardResponse5Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoardResponse5 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoardResponse5 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoardResponse5 entity);
}