package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory37;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory37Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory37 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory37 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory37 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory37 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory37 entity);
}