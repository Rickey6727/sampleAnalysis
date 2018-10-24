package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard53;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard53Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard53 entity
     */
    @Select
    TMessageBoard53 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard53 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard53 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard53 entity);
}