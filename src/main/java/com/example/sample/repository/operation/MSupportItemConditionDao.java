package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MSupportItemCondition;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MSupportItemConditionDao {

    /**
     * @param supportItemId
     * @return the MSupportItemCondition entity
     */
    @Select
    MSupportItemCondition selectById(Integer supportItemId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MSupportItemCondition entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MSupportItemCondition entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MSupportItemCondition entity);
}