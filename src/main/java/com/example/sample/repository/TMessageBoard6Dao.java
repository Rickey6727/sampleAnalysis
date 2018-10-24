package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard6;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard6Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard6 entity
     */
    @Select
    TMessageBoard6 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard6 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard6 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard6 entity);
}