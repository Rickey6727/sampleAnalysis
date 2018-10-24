package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory4;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory4Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory4 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory4 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory4 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory4 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory4 entity);
}