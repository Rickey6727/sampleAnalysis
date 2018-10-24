package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard47;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard47Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard47 entity
     */
    @Select
    TMessageBoard47 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard47 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard47 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard47 entity);
}