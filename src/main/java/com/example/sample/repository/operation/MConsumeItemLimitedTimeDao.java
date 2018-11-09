package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MConsumeItemLimitedTime;
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
public interface MConsumeItemLimitedTimeDao {

    /**
     * @param itemId
     * @return the MConsumeItemLimitedTime entity
     */
    @Select
    Optional<MConsumeItemLimitedTime> selectById(Integer itemId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MConsumeItemLimitedTime entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MConsumeItemLimitedTime entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MConsumeItemLimitedTime entity);
}