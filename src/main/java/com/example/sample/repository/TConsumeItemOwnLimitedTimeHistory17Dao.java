package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory17;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory17Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory17 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory17 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory17 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory17 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory17 entity);
}