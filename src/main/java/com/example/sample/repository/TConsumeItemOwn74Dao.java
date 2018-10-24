package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwn74;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwn74Dao {

    /**
     * @param accountId
     * @param itemId
     * @return the TConsumeItemOwn74 entity
     */
    @Select
    TConsumeItemOwn74 selectById(Integer accountId, Integer itemId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwn74 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwn74 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwn74 entity);
}