package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard0;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard0Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard0 entity
     */
    @Select
    TMessageBoard0 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard0 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard0 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard0 entity);
}