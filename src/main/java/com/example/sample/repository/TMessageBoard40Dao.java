package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard40;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard40Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard40 entity
     */
    @Select
    TMessageBoard40 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard40 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard40 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard40 entity);
}