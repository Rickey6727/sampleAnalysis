package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MInitialStartup;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MInitialStartupDao {

    /**
     * @param itemId
     * @param itemType
     * @return the MInitialStartup entity
     */
    @Select
    MInitialStartup selectById(Integer itemId, Integer itemType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MInitialStartup entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MInitialStartup entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MInitialStartup entity);
}