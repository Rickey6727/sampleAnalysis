package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MIpLocator;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MIpLocatorDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MIpLocator entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MIpLocator entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MIpLocator entity);
}