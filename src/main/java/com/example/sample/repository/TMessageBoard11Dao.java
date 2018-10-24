package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard11;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard11Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard11 entity
     */
    @Select
    TMessageBoard11 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard11 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard11 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard11 entity);
}