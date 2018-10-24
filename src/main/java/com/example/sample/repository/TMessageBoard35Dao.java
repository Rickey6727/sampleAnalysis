package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard35;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard35Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard35 entity
     */
    @Select
    TMessageBoard35 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard35 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard35 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard35 entity);
}