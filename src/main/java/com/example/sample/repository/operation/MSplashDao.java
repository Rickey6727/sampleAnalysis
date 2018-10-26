package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MSplash;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MSplashDao {

    /**
     * @param splashId
     * @return the MSplash entity
     */
    @Select
    MSplash selectById(Integer splashId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MSplash entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MSplash entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MSplash entity);
}