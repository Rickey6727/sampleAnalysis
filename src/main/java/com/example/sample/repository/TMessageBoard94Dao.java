package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard94;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard94Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard94 entity
     */
    @Select
    TMessageBoard94 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard94 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard94 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard94 entity);
}