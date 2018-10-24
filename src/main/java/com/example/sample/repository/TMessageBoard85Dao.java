package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard85;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard85Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard85 entity
     */
    @Select
    TMessageBoard85 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard85 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard85 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard85 entity);
}