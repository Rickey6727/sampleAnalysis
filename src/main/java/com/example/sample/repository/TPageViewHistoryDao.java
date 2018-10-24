package com.example.sample.repository;

import com.example.sample.entity.TPageViewHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPageViewHistoryDao {

    /**
     * @param serialId
     * @return the TPageViewHistory entity
     */
    @Select
    TPageViewHistory selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPageViewHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPageViewHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPageViewHistory entity);
}