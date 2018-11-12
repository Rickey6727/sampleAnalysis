package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TAd;
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
public interface TAdDao {

    /**
     * @param accountId
     * @param rewardType
     * @return the TAd entity
     */
    @Select
    Optional<TAd> selectById(Integer accountId, String rewardType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TAd entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TAd entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TAd entity);
}