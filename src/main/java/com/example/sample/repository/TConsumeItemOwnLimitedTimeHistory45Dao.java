package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory45;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory45Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory45 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory45 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory45 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory45 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory45 entity);
}