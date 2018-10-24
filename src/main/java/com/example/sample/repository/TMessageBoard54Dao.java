package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard54;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard54Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard54 entity
     */
    @Select
    TMessageBoard54 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard54 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard54 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard54 entity);
}