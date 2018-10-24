package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwn58;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwn58Dao {

    /**
     * @param accountId
     * @param itemId
     * @return the TConsumeItemOwn58 entity
     */
    @Select
    TConsumeItemOwn58 selectById(Integer accountId, Integer itemId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwn58 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwn58 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwn58 entity);
}