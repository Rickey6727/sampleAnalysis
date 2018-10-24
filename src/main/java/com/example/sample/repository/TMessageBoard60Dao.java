package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard60;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard60Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard60 entity
     */
    @Select
    TMessageBoard60 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard60 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard60 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard60 entity);
}