package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MRaiseEvent;
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
public interface MRaiseEventDao {

    /**
     * @param eventId
     * @return the MRaiseEvent entity
     */
    @Select
    Optional<MRaiseEvent> selectById(Integer eventId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MRaiseEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MRaiseEvent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MRaiseEvent entity);
}