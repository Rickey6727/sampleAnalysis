package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MConsumeItem;
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
public interface MConsumeItemDao {

    /**
     * @param itemId
     * @return the MConsumeItem entity
     */
    @Select
    Optional<MConsumeItem> selectById(Integer itemId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MConsumeItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MConsumeItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MConsumeItem entity);
}