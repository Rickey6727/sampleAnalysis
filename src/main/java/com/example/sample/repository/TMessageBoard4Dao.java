package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard4;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard4Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard4 entity
     */
    @Select
    TMessageBoard4 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard4 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard4 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard4 entity);
}