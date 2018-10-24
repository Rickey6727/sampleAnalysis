package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard28;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard28Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard28 entity
     */
    @Select
    TMessageBoard28 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard28 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard28 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard28 entity);
}