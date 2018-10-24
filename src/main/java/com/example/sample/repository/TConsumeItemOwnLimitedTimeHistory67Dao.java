package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory67;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory67Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory67 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory67 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory67 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory67 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory67 entity);
}