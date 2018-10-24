package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard62;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard62Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard62 entity
     */
    @Select
    TMessageBoard62 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard62 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard62 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard62 entity);
}