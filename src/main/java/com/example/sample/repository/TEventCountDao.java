package com.example.sample.repository;

import com.example.sample.entity.TEventCount;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TEventCountDao {

    /**
     * @param eventId
     * @param accountId
     * @return the TEventCount entity
     */
    @Select
    TEventCount selectById(Integer eventId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TEventCount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TEventCount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TEventCount entity);
}