package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard63;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard63Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard63 entity
     */
    @Select
    TMessageBoard63 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard63 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard63 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard63 entity);
}