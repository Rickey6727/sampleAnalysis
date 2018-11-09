package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MEffectItemCountry;
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
public interface MEffectItemCountryDao {

    /**
     * @param itemId
     * @param countryCd
     * @return the MEffectItemCountry entity
     */
    @Select
    Optional<MEffectItemCountry> selectById(Integer itemId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MEffectItemCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MEffectItemCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MEffectItemCountry entity);
}