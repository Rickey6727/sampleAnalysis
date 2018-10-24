package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard78;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard78Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard78 entity
     */
    @Select
    TMessageBoard78 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard78 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard78 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard78 entity);
}