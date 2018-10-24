package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard82;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard82Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard82 entity
     */
    @Select
    TMessageBoard82 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard82 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard82 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard82 entity);
}