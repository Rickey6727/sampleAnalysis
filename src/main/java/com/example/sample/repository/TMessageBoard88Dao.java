package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard88;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard88Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard88 entity
     */
    @Select
    TMessageBoard88 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard88 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard88 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard88 entity);
}