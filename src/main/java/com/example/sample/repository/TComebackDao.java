package com.example.sample.repository;

import com.example.sample.entity.TComeback;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TComebackDao {

    /**
     * @param accountId
     * @param loginId
     * @return the TComeback entity
     */
    @Select
    TComeback selectById(Integer accountId, Integer loginId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TComeback entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TComeback entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TComeback entity);
}