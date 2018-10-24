package com.example.sample.repository;

import com.example.sample.entity.TConsumeItemOwnLimitedTimeHistory48;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TConsumeItemOwnLimitedTimeHistory48Dao {

    /**
     * @param serialId
     * @return the TConsumeItemOwnLimitedTimeHistory48 entity
     */
    @Select
    TConsumeItemOwnLimitedTimeHistory48 selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TConsumeItemOwnLimitedTimeHistory48 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TConsumeItemOwnLimitedTimeHistory48 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TConsumeItemOwnLimitedTimeHistory48 entity);
}