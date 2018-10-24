package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard19;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard19Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard19 entity
     */
    @Select
    TMessageBoard19 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard19 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard19 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard19 entity);
}