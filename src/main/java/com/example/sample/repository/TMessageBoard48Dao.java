package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard48;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard48Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard48 entity
     */
    @Select
    TMessageBoard48 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard48 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard48 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard48 entity);
}