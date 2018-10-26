package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MGainItem;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MGainItemDao {

    /**
     * @param gainId
     * @param no
     * @return the MGainItem entity
     */
    @Select
    MGainItem selectById(Integer gainId, Integer no);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGainItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGainItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGainItem entity);
}