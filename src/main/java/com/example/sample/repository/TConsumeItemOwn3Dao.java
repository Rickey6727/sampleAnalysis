package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwn3;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwn3Dao {

    /**
     * @param accountId
     * @param itemId
     * @return the TConsumeItemOwn3 entity
     */
    @Select
    TConsumeItemOwn3 selectById(Integer accountId, Integer itemId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwn3 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwn3 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwn3 entity);
}