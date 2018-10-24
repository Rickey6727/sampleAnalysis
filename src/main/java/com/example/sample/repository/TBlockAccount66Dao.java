package com.example.sample.repository;

import com.example.sample.entity.TBlockAccount66;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TBlockAccount66Dao {

    /**
     * @param blockerAccountId
     * @param blockedAccountId
     * @return the TBlockAccount66 entity
     */
    @Select
    TBlockAccount66 selectById(Integer blockerAccountId, Integer blockedAccountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TBlockAccount66 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TBlockAccount66 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TBlockAccount66 entity);
}