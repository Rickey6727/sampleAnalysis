package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard86;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard86Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard86 entity
     */
    @Select
    TMessageBoard86 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard86 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard86 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard86 entity);
}