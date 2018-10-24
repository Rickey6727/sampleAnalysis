package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard75;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard75Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard75 entity
     */
    @Select
    TMessageBoard75 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard75 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard75 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard75 entity);
}