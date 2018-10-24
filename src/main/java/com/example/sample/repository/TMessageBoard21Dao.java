package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard21;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard21Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard21 entity
     */
    @Select
    TMessageBoard21 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard21 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard21 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard21 entity);
}