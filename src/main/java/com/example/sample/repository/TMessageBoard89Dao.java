package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard89;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard89Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard89 entity
     */
    @Select
    TMessageBoard89 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard89 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard89 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard89 entity);
}