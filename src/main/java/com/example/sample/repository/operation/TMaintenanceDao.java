package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.TMaintenance;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TMaintenanceDao {

    /**
     * @param id
     * @return the TMaintenance entity
     */
    @Select
    TMaintenance selectById(Integer id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TMaintenance entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TMaintenance entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TMaintenance entity);
}