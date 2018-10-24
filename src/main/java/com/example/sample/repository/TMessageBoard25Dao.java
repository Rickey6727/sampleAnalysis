package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard25;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard25Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard25 entity
     */
    @Select
    TMessageBoard25 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard25 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard25 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard25 entity);
}