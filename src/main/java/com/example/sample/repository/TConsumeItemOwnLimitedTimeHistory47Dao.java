package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory47;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory47Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory47 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory47 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory47 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory47 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory47 entity);
}