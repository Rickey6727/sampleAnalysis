package com.example.sample.repository;

import com.example.sample.entity.TMessageBoard45;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TMessageBoard45Dao {

    /**
     * @param accountId
     * @param commentId
     * @return the TMessageBoard45 entity
     */
    @Select
    TMessageBoard45 selectById(Integer accountId, Long commentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMessageBoard45 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMessageBoard45 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMessageBoard45 entity);
}