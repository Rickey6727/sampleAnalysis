package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard13;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard13Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard13 entity
     */
    @Select
    TMessageBoard13 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard13 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard13 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard13 entity);
}