package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MExchangeSide;
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
public interface MExchangeSideDao {

    /**
     * @param exchangeId
     * @return the MExchangeSide entity
     */
    @Select
    Optional<MExchangeSide> selectById(Integer exchangeId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MExchangeSide entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MExchangeSide entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MExchangeSide entity);
}