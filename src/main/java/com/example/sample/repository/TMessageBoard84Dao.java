package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard84;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard84Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard84 entity
     */
    @Select
    TMessageBoard84 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard84 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard84 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard84 entity);
}