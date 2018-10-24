package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard51;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard51Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard51 entity
     */
    @Select
    TMessageBoard51 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard51 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard51 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard51 entity);
}