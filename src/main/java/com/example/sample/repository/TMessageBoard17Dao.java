package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard17;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard17Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard17 entity
     */
    @Select
    TMessageBoard17 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard17 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard17 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard17 entity);
}