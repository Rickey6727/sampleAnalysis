package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory78;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory78Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory78 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory78 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory78 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory78 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory78 entity);
}