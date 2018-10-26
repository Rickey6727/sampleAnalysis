package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TGachaCountRewardHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TGachaCountRewardHistoryDao {

    /**
     * @param serialId
     * @return the TGachaCountRewardHistory entity
     */
    @Select
    TGachaCountRewardHistory selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGachaCountRewardHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGachaCountRewardHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGachaCountRewardHistory entity);
}