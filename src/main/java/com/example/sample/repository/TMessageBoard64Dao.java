package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard64;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard64Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard64 entity
     */
    @Select
    TMessageBoard64 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard64 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard64 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard64 entity);
}