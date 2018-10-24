package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory22;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory22Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory22 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory22 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory22 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory22 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory22 entity);
}