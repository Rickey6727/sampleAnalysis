package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard5;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard5Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard5 entity
     */
    @Select
    TMessageBoard5 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard5 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard5 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard5 entity);
}