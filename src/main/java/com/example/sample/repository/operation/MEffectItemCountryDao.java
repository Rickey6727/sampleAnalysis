package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MEffectItemCountry;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MEffectItemCountryDao {

    /**
     * @param itemId
     * @param countryCd
     * @return the MEffectItemCountry entity
     */
    @Select
    MEffectItemCountry selectById(Integer itemId, Integer countryCd);

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