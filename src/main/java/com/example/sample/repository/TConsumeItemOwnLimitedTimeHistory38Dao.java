package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory38;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory38Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory38 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory38 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory38 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory38 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory38 entity);
}