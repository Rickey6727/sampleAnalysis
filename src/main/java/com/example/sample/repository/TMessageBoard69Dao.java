package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard69;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard69Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard69 entity
     */
    @Select
    TMessageBoard69 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard69 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard69 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard69 entity);
}