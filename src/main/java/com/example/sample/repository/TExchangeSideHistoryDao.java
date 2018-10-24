package com.example.sample.repository;

import com.example.sample.entity.TExchangeSideHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TExchangeSideHistoryDao {

    /**
     * @param serialId
     * @return the TExchangeSideHistory entity
     */
    @Select
    TExchangeSideHistory selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TExchangeSideHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TExchangeSideHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TExchangeSideHistory entity);
}