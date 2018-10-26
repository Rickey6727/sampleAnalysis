package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MRaiseEventCarePoint;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MRaiseEventCarePointDao {

    /**
     * @param eventId
     * @return the MRaiseEventCarePoint entity
     */
    @Select
    MRaiseEventCarePoint selectById(Integer eventId);

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