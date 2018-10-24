package com.example.sample.repository;

import com.example.sample.entity.TBlockAccount32;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBlockAccount32Dao {

    /**
     * @param blockerAccountId
     * @param blockedAccountId
     * @return the TBlockAccount32 entity
     */
    @Select
    TBlockAccount32 selectById(Integer blockerAccountId, Integer blockedAccountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBlockAccount32 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBlockAccount32 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBlockAccount32 entity);
}