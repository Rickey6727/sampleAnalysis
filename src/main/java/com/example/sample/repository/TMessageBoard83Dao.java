package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard83;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard83Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard83 entity
     */
    @Select
    TMessageBoard83 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard83 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard83 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard83 entity);
}