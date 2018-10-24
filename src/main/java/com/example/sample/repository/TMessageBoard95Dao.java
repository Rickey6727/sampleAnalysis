package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard95;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard95Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard95 entity
     */
    @Select
    TMessageBoard95 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard95 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard95 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard95 entity);
}