package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard52;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard52Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard52 entity
     */
    @Select
    TMessageBoard52 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard52 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard52 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard52 entity);
}