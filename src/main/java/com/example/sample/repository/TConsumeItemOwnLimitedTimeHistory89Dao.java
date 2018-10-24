package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory89;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory89Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory89 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory89 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory89 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory89 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory89 entity);
}