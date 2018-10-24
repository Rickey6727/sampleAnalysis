package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory84;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory84Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory84 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory84 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory84 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory84 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory84 entity);
}