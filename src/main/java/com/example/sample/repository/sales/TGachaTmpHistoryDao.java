package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TGachaTmpHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TGachaTmpHistoryDao {

    /**
     * @param serialId
     * @return the TGachaTmpHistory entity
     */
    @Select
    TGachaTmpHistory selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGachaTmpHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGachaTmpHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGachaTmpHistory entity);
}