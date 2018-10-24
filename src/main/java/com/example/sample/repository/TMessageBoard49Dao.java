package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard49;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard49Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard49 entity
     */
    @Select
    TMessageBoard49 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard49 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard49 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard49 entity);
}