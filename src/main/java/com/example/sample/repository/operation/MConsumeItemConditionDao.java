package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MConsumeItemCondition;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 */
@ConfigAutowireable
@Dao(config = DomaConfig.class)
public interface MConsumeItemConditionDao {

    /**
     * @param itemId
     * @param goodsId
     * @param goodsType
     * @return the MConsumeItemCondition entity
     */
    @Select
    Optional<MConsumeItemCondition> selectById(Integer itemId, Integer goodsId, Integer goodsType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MConsumeItemCondition entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MConsumeItemCondition entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MConsumeItemCondition entity);
}