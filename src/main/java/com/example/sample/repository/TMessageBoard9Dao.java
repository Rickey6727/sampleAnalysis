package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard9;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard9Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard9 entity
     */
    @Select
    TMessageBoard9 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard9 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard9 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard9 entity);
}