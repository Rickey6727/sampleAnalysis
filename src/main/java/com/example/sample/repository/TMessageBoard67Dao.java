package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard67;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard67Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard67 entity
     */
    @Select
    TMessageBoard67 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard67 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard67 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard67 entity);
}