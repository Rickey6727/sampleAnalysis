package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory56;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory56Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory56 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory56 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory56 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory56 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory56 entity);
}