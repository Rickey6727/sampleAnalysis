package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory3;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory3Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory3 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory3 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory3 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory3 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory3 entity);
}