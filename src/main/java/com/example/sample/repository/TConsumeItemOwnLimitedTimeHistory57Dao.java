package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory57;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory57Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory57 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory57 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory57 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory57 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory57 entity);
}