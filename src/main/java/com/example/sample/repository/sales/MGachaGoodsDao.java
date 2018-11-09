package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MGachaGoods;
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
public interface MGachaGoodsDao {

    /**
     * @param gachaId
     * @param goodsNo
     * @param giveType
     * @return the MGachaGoods entity
     */
    @Select
    Optional<MGachaGoods> selectById(Integer gachaId, Integer goodsNo, Integer giveType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGachaGoods entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGachaGoods entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGachaGoods entity);
}