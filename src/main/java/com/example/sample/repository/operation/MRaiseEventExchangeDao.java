package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MRaiseEventExchange;
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
public interface MRaiseEventExchangeDao {

    /**
     * @param eventId
     * @param exchangeNo
     * @return the MRaiseEventExchange entity
     */
    @Select
    Optional<MRaiseEventExchange> selectById(Integer eventId, Short exchangeNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MRaiseEventExchange entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MRaiseEventExchange entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MRaiseEventExchange entity);
}