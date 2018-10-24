package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard34;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard34Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard34 entity
     */
    @Select
    TMessageBoard34 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard34 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard34 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard34 entity);
}