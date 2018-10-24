package com.example.sample.repository;

import com.example.sample.entity.TRaiseEventItemOwn;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TRaiseEventItemOwnDao {

    /**
     * @param accountId
     * @param itemId
     * @return the TRaiseEventItemOwn entity
     */
    @Select
    TRaiseEventItemOwn selectById(Integer accountId, Integer itemId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TRaiseEventItemOwn entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TRaiseEventItemOwn entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TRaiseEventItemOwn entity);
}