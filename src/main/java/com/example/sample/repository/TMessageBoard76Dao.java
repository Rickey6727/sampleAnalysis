package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard76;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard76Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard76 entity
     */
    @Select
    TMessageBoard76 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard76 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard76 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard76 entity);
}