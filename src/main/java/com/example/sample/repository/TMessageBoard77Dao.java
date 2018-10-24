package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard77;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard77Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard77 entity
     */
    @Select
    TMessageBoard77 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard77 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard77 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard77 entity);
}