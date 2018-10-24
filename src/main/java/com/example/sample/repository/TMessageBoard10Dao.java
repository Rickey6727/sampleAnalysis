package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard10;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard10Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard10 entity
     */
    @Select
    TMessageBoard10 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard10 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard10 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard10 entity);
}