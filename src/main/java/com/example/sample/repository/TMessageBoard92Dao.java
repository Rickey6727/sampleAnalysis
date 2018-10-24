package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard92;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard92Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard92 entity
     */
    @Select
    TMessageBoard92 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard92 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard92 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard92 entity);
}