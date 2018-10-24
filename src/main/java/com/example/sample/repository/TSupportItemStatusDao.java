package com.example.sample.repository;

import com.example.sample.entity.TSupportItemStatus;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TSupportItemStatusDao {

    /**
     * @param accountId
     * @param supportItemId
     * @return the TSupportItemStatus entity
     */
    @Select
    TSupportItemStatus selectById(Integer accountId, Integer supportItemId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TSupportItemStatus entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TSupportItemStatus entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TSupportItemStatus entity);
}