package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MGachaCountSale;
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
public interface MGachaCountSaleDao {

    /**
     * @param gachaId
     * @param gachaCount
     * @param gachaKind
     * @return the MGachaCountSale entity
     */
    @Select
    Optional<MGachaCountSale> selectById(Integer gachaId, Integer gachaCount, Integer gachaKind);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGachaCountSale entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGachaCountSale entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGachaCountSale entity);
}