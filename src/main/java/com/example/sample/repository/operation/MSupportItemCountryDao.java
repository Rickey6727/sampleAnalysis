package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MSupportItemCountry;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MSupportItemCountryDao {

    /**
     * @param supportItemId
     * @param countryCd
     * @return the MSupportItemCountry entity
     */
    @Select
    MSupportItemCountry selectById(Integer supportItemId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MSupportItemCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MSupportItemCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MSupportItemCountry entity);
}