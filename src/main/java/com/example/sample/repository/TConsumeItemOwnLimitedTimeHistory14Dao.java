package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory14;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory14Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory14 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory14 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory14 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory14 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory14 entity);
}