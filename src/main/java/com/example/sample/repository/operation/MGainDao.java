package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MGain;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MGainDao {

    /**
     * @param gainId
     * @return the MGain entity
     */
    @Select
    MGain selectById(Integer gainId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGain entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGain entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGain entity);
}