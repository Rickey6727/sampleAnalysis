package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MPushCountry;
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
public interface MPushCountryDao {

    /**
     * @param pushMessageId
     * @param countryCd
     * @return the MPushCountry entity
     */
    @Select
    Optional<MPushCountry> selectById(Integer pushMessageId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MPushCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MPushCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MPushCountry entity);
}