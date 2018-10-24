package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard20;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard20Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard20 entity
     */
    @Select
    TMessageBoard20 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard20 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard20 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard20 entity);
}