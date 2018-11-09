package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MGachaCountry;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 */
@ConfigAutowireable
@Dao(config = DomaConfig.class)
public interface MGachaCountryDao {

    /**
     * @param gachaId
     * @param countryCd
     * @return the MGachaCountry entity
     */
    @Select
    Optional<MGachaCountry> selectById(Integer gachaId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGachaCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGachaCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGachaCountry entity);
}