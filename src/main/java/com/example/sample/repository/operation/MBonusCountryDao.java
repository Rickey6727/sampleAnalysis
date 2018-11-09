package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MBonusCountry;
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
public interface MBonusCountryDao {

    /**
     * @param bonusId
     * @param countryCd
     * @return the MBonusCountry entity
     */
    @Select
    Optional<MBonusCountry> selectById(Integer bonusId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MBonusCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MBonusCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MBonusCountry entity);
}