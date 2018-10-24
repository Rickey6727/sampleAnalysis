package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTime70;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTime70Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTime70 entity
     */
    @Select
    TConsumeItemOwnLimitedTime70 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTime70 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTime70 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTime70 entity);
}