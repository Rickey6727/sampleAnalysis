package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory26;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory26Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory26 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory26 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory26 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory26 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory26 entity);
}