package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard44;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard44Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard44 entity
     */
    @Select
    TMessageBoard44 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard44 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard44 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard44 entity);
}