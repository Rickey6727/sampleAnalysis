package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory51;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory51Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory51 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory51 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory51 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory51 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory51 entity);
}