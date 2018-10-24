package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard12;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard12Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard12 entity
     */
    @Select
    TMessageBoard12 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard12 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard12 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard12 entity);
}