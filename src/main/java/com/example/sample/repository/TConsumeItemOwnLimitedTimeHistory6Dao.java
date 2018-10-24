package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory6;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory6Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory6 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory6 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory6 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory6 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory6 entity);
}