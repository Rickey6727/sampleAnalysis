package com.example.sample.repository;

import com.example.sample.entity.TBlockAccount23;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBlockAccount23Dao {

    /**
     * @param blockerAccountId
     * @param blockedAccountId
     * @return the TBlockAccount23 entity
     */
    @Select
    TBlockAccount23 selectById(Integer blockerAccountId, Integer blockedAccountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBlockAccount23 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBlockAccount23 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBlockAccount23 entity);
}