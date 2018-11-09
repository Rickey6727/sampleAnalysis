package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MExchangeSideDescription;
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
public interface MExchangeSideDescriptionDao {

    /**
     * @param exchangeId
     * @param countryCd
     * @return the MExchangeSideDescription entity
     */
    @Select
    Optional<MExchangeSideDescription> selectById(Integer exchangeId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MExchangeSideDescription entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MExchangeSideDescription entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MExchangeSideDescription entity);
}