package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory21;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory21Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory21 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory21 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory21 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory21 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory21 entity);
}