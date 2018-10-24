package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard97;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard97Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard97 entity
     */
    @Select
    TMessageBoard97 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard97 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard97 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard97 entity);
}