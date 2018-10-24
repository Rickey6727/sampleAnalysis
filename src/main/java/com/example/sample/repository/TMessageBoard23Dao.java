package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard23;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard23Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard23 entity
     */
    @Select
    TMessageBoard23 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard23 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard23 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard23 entity);
}