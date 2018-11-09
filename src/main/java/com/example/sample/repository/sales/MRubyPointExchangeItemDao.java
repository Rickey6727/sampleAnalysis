package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MRubyPointExchangeItem;
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
public interface MRubyPointExchangeItemDao {

    /**
     * @param gachaId
     * @param exchangeId
     * @return the MRubyPointExchangeItem entity
     */
    @Select
    Optional<MRubyPointExchangeItem> selectById(Integer gachaId, Integer exchangeId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MRubyPointExchangeItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MRubyPointExchangeItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MRubyPointExchangeItem entity);
}