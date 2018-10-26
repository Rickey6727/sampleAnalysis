package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MSplashCountry;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MSplashCountryDao {

    /**
     * @param splashId
     * @param countryCd
     * @return the MSplashCountry entity
     */
    @Select
    MSplashCountry selectById(Integer splashId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MSplashCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MSplashCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MSplashCountry entity);
}