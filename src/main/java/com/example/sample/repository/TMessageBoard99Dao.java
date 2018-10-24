package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard99;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard99Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard99 entity
     */
    @Select
    TMessageBoard99 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard99 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard99 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard99 entity);
}