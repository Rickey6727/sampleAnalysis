package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory31;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory31Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory31 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory31 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory31 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory31 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory31 entity);
}