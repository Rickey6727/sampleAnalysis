package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MEventCountry;
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
public interface MEventCountryDao {

    /**
     * @param eventId
     * @param countryCd
     * @return the MEventCountry entity
     */
    @Select
    Optional<MEventCountry> selectById(Integer eventId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MEventCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MEventCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MEventCountry entity);
}