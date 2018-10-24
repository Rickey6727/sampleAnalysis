package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard72;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard72Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard72 entity
     */
    @Select
    TMessageBoard72 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard72 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard72 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard72 entity);
}