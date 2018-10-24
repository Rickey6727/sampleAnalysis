package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard59;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard59Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard59 entity
     */
    @Select
    TMessageBoard59 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard59 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard59 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard59 entity);
}