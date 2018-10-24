package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard50;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard50Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard50 entity
     */
    @Select
    TMessageBoard50 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard50 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard50 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard50 entity);
}