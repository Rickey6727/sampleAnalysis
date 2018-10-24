package com.example.sample.repository;

import com.example.sample.entity.TRaiseEventItemOwnHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TRaiseEventItemOwnHistoryDao {

    /**
     * @param serialId
     * @return the TRaiseEventItemOwnHistory entity
     */
    @Select
    TRaiseEventItemOwnHistory selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TRaiseEventItemOwnHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TRaiseEventItemOwnHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TRaiseEventItemOwnHistory entity);
}