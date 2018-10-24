package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwn92;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwn92Dao {

    /**
     * @param accountId
     * @param itemId
     * @return the TConsumeItemOwn92 entity
     */
    @Select
    TConsumeItemOwn92 selectById(Integer accountId, Integer itemId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwn92 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwn92 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwn92 entity);
}