package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MRaiseEventCarePoint;
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
public interface MRaiseEventCarePointDao {

    /**
     * @param eventId
     * @return the MRaiseEventCarePoint entity
     */
    @Select
    Optional<MRaiseEventCarePoint> selectById(Integer eventId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MRaiseEventCarePoint entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MRaiseEventCarePoint entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MRaiseEventCarePoint entity);
}