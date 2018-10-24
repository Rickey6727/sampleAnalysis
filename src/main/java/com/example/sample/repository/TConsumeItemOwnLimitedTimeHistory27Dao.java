package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory27;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory27Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory27 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory27 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory27 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory27 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory27 entity);
}