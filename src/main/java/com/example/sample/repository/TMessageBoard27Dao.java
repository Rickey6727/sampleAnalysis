package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard27;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard27Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard27 entity
     */
    @Select
    TMessageBoard27 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard27 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard27 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard27 entity);
}