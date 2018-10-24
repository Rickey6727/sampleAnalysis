package com.example.sample.repository;

import com.example.sample.entity.TEventUser;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TEventUserDao {

    /**
     * @param eventType
     * @param eventId
     * @param accountId
     * @return the TEventUser entity
     */
    @Select
    TEventUser selectById(Integer eventType, Integer eventId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TEventUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TEventUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TEventUser entity);
}