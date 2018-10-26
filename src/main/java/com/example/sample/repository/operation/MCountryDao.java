package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MCountry;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MCountryDao {

    /**
     * @param countryId
     * @param countryCd
     * @return the MCountry entity
     */
    @Select
    MCountry selectById(Integer countryId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MCountry entity);
}