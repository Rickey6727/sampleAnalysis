package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwn25;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwn25Dao {

    /**
     * @param accountId
     * @param itemId
     * @return the TConsumeItemOwn25 entity
     */
    @Select
    TConsumeItemOwn25 selectById(Integer accountId, Integer itemId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwn25 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwn25 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwn25 entity);
}