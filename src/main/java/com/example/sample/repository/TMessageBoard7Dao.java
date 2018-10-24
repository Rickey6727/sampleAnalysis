package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard7;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard7Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard7 entity
     */
    @Select
    TMessageBoard7 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard7 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard7 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard7 entity);
}