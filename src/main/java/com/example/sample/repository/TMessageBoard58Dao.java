package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard58;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard58Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard58 entity
     */
    @Select
    TMessageBoard58 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard58 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard58 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard58 entity);
}