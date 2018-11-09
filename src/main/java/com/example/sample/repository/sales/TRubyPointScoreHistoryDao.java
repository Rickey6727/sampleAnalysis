package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TRubyPointScoreHistory;
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
public interface TRubyPointScoreHistoryDao {

    /**
     * @param serialId
     * @return the TRubyPointScoreHistory entity
     */
    @Select
    Optional<TRubyPointScoreHistory> selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TRubyPointScoreHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TRubyPointScoreHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TRubyPointScoreHistory entity);
}