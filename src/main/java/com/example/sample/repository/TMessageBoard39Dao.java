package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard39;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard39Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard39 entity
     */
    @Select
    TMessageBoard39 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard39 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard39 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard39 entity);
}