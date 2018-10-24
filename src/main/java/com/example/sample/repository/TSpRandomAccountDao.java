package com.example.sample.repository;

import com.example.sample.entity.TSpRandomAccount;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TSpRandomAccountDao {

    /**
     * @param randomType
     * @param accountId
     * @return the TSpRandomAccount entity
     */
    @Select
    TSpRandomAccount selectById(Integer randomType, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TSpRandomAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TSpRandomAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TSpRandomAccount entity);
}