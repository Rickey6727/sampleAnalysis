package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory96;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory96Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory96 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory96 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory96 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory96 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory96 entity);
}