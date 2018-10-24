package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard32;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard32Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard32 entity
     */
    @Select
    TMessageBoard32 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard32 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard32 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard32 entity);
}