package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard26;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard26Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard26 entity
     */
    @Select
    TMessageBoard26 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard26 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard26 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard26 entity);
}