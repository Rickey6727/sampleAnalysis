package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard36;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard36Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard36 entity
     */
    @Select
    TMessageBoard36 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard36 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard36 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard36 entity);
}