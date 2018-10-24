package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard61;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard61Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard61 entity
     */
    @Select
    TMessageBoard61 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard61 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard61 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard61 entity);
}