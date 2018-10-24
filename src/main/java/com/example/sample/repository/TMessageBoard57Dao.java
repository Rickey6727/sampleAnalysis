package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard57;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard57Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard57 entity
     */
    @Select
    TMessageBoard57 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard57 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard57 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard57 entity);
}