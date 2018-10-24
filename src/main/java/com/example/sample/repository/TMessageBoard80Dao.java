package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard80;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard80Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard80 entity
     */
    @Select
    TMessageBoard80 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard80 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard80 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard80 entity);
}