package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TGachaHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TGachaHistoryDao {

    /**
     * @param serialId
     * @return the TGachaHistory entity
     */
    @Select
    TGachaHistory selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGachaHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGachaHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGachaHistory entity);
}