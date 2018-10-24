package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory43;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory43Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory43 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory43 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory43 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory43 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory43 entity);
}