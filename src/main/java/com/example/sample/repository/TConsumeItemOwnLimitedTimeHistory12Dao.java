package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory12;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory12Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory12 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory12 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory12 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory12 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory12 entity);
}