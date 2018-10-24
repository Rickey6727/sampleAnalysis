package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard65;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard65Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard65 entity
     */
    @Select
    TMessageBoard65 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard65 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard65 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard65 entity);
}