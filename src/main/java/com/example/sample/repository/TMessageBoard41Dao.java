package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard41;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard41Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard41 entity
     */
    @Select
    TMessageBoard41 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard41 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard41 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard41 entity);
}