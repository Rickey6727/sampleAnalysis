package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard96;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard96Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard96 entity
     */
    @Select
    TMessageBoard96 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard96 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard96 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard96 entity);
}