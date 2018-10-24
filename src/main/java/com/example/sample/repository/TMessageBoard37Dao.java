package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard37;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard37Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard37 entity
     */
    @Select
    TMessageBoard37 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard37 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard37 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard37 entity);
}