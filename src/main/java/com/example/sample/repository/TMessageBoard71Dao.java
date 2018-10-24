package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard71;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard71Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard71 entity
     */
    @Select
    TMessageBoard71 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard71 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard71 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard71 entity);
}