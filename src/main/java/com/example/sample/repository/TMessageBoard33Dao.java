package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard33;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard33Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard33 entity
     */
    @Select
    TMessageBoard33 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard33 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard33 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard33 entity);
}