package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MGachaBoxSale;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MGachaBoxSaleDao {

    /**
     * @param gachaId
     * @param numberLaps
     * @return the MGachaBoxSale entity
     */
    @Select
    MGachaBoxSale selectById(Integer gachaId, Integer numberLaps);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGachaBoxSale entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGachaBoxSale entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGachaBoxSale entity);
}