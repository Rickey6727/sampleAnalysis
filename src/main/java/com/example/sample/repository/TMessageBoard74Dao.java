package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard74;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard74Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard74 entity
     */
    @Select
    TMessageBoard74 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard74 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard74 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard74 entity);
}