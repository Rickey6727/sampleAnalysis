package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MGachaProduction;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MGachaProductionDao {

    /**
     * @param gachaId
     * @param stepId
     * @param productionRarity
     * @param productionType
     * @param productionId
     * @return the MGachaProduction entity
     */
    @Select
    MGachaProduction selectById(Integer gachaId, Integer stepId, Integer productionRarity, Integer productionType, Integer productionId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGachaProduction entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGachaProduction entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGachaProduction entity);
}