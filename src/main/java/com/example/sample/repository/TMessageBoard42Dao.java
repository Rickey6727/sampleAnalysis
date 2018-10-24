package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard42;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard42Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard42 entity
     */
    @Select
    TMessageBoard42 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard42 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard42 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard42 entity);
}