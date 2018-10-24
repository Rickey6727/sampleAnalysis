package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard1;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard1Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard1 entity
     */
    @Select
    TMessageBoard1 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard1 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard1 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard1 entity);
}