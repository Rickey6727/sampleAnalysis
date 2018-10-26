package com.example.sample.repository.sales;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TRubyPointTmpHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TRubyPointTmpHistoryDao {

    /**
     * @param serialId
     * @return the TRubyPointTmpHistory entity
     */
    @Select
    TRubyPointTmpHistory selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TRubyPointTmpHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TRubyPointTmpHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TRubyPointTmpHistory entity);
}