package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory39;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory39Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory39 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory39 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory39 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory39 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory39 entity);
}