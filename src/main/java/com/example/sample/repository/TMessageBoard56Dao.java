package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard56;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard56Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard56 entity
     */
    @Select
    TMessageBoard56 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard56 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard56 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard56 entity);
}