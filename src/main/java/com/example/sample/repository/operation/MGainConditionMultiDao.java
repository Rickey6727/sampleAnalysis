package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MGainConditionMulti;
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
public interface MGainConditionMultiDao {

    /**
     * @param gainId
     * @param conditionType
     * @param no
     * @return the MGainConditionMulti entity
     */
    @Select
    Optional<MGainConditionMulti> selectById(Integer gainId, Integer conditionType, Integer no);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGainConditionMulti entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGainConditionMulti entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGainConditionMulti entity);
}