package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MRaiseEventLevel;
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
public interface MRaiseEventLevelDao {

    /**
     * @param eventId
     * @param point
     * @return the MRaiseEventLevel entity
     */
    @Select
    Optional<MRaiseEventLevel> selectById(Integer eventId, Integer point);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MRaiseEventLevel entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MRaiseEventLevel entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MRaiseEventLevel entity);
}