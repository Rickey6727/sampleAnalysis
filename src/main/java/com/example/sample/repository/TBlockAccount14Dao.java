package com.example.sample.repository;

import com.example.sample.entity.TBlockAccount14;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBlockAccount14Dao {

    /**
     * @param blockerAccountId
     * @param blockedAccountId
     * @return the TBlockAccount14 entity
     */
    @Select
    TBlockAccount14 selectById(Integer blockerAccountId, Integer blockedAccountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBlockAccount14 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBlockAccount14 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBlockAccount14 entity);
}