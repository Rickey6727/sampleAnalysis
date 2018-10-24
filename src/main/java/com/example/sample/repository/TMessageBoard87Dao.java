package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard87;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard87Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard87 entity
     */
    @Select
    TMessageBoard87 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard87 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard87 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard87 entity);
}