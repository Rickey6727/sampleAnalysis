package com.example.sample.repository;

import com.example.sample.entity.TEventMail;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TEventMailDao {

    /**
     * @param accountId
     * @return the TEventMail entity
     */
    @Select
    TEventMail selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TEventMail entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TEventMail entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TEventMail entity);
}