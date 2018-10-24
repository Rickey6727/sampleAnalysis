package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard16;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard16Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard16 entity
     */
    @Select
    TMessageBoard16 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard16 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard16 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard16 entity);
}