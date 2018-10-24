package com.example.sample.repository;

import com.example.sample.entity.TSupportItemStatusOfCheer;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TSupportItemStatusOfCheerDao {

    /**
     * @param accountId
     * @param supportItemId
     * @return the TSupportItemStatusOfCheer entity
     */
    @Select
    TSupportItemStatusOfCheer selectById(Integer accountId, Integer supportItemId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TSupportItemStatusOfCheer entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TSupportItemStatusOfCheer entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TSupportItemStatusOfCheer entity);
}