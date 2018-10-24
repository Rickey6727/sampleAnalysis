package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard79;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard79Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard79 entity
     */
    @Select
    TMessageBoard79 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard79 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard79 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard79 entity);
}