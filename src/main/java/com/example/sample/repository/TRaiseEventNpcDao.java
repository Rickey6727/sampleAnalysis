package com.example.sample.repository;

import com.example.sample.entity.TRaiseEventNpc;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TRaiseEventNpcDao {

    /**
     * @param accountId
     * @return the TRaiseEventNpc entity
     */
    @Select
    TRaiseEventNpc selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TRaiseEventNpc entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TRaiseEventNpc entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TRaiseEventNpc entity);
}