package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard68;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard68Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard68 entity
     */
    @Select
    TMessageBoard68 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard68 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard68 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard68 entity);
}