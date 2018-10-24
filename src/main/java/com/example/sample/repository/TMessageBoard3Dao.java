package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard3;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard3Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard3 entity
     */
    @Select
    TMessageBoard3 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard3 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard3 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard3 entity);
}