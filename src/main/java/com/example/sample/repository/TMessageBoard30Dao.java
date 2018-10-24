package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard30;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard30Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard30 entity
     */
    @Select
    TMessageBoard30 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard30 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard30 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard30 entity);
}