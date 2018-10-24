package com.example.sample.repository;

import com.example.sample.entity.TMessageBoardResponse3;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoardResponse3Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoardResponse3 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoardResponse3 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoardResponse3 entity);
}