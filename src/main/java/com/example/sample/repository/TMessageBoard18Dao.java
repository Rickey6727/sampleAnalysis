package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard18;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard18Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard18 entity
     */
    @Select
    TMessageBoard18 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard18 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard18 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard18 entity);
}