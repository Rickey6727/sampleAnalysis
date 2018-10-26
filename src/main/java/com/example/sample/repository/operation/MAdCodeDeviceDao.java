package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MAdCodeDevice;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MAdCodeDeviceDao {

    /**
     * @param deviceType
     * @param adCode
     * @return the MAdCodeDevice entity
     */
    @Select
    MAdCodeDevice selectById(Integer deviceType, String adCode);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MAdCodeDevice entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MAdCodeDevice entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MAdCodeDevice entity);
}