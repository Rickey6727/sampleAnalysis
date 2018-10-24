package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard22;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard22Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard22 entity
     */
    @Select
    TMessageBoard22 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard22 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard22 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard22 entity);
}