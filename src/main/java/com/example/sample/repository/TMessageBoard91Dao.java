package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard91;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard91Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard91 entity
     */
    @Select
    TMessageBoard91 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard91 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard91 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard91 entity);
}