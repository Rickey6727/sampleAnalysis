package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard66;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard66Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard66 entity
     */
    @Select
    TMessageBoard66 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard66 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard66 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard66 entity);
}