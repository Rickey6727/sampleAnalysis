package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard55;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard55Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard55 entity
     */
    @Select
    TMessageBoard55 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard55 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard55 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard55 entity);
}