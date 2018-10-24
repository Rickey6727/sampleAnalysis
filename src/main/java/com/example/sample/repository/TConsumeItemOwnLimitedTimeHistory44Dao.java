package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory44;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory44Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory44 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory44 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory44 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory44 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory44 entity);
}