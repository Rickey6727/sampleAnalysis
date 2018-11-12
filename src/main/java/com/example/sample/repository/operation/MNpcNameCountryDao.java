package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MNpcNameCountry;
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
public interface MNpcNameCountryDao {

    /**
     * @param npcId
     * @param countryCd
     * @return the MNpcNameCountry entity
     */
    @Select
    Optional<MNpcNameCountry> selectById(Integer npcId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MNpcNameCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MNpcNameCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MNpcNameCountry entity);
}