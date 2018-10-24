package com.example.sample.repository;

import com.example.sample.entity.TBlockAccount1;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBlockAccount1Dao {

    /**
     * @param blockerAccountId
     * @param blockedAccountId
     * @return the TBlockAccount1 entity
     */
    @Select
    TBlockAccount1 selectById(Integer blockerAccountId, Integer blockedAccountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBlockAccount1 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBlockAccount1 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBlockAccount1 entity);
}