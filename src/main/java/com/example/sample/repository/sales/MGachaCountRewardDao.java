package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.MGachaCountReward;
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
public interface MGachaCountRewardDao {

    /**
     * @param gachaId
     * @param gachaCount
     * @return the MGachaCountReward entity
     */
    @Select
    Optional<MGachaCountReward> selectById(Integer gachaId, Integer gachaCount);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGachaCountReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGachaCountReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGachaCountReward entity);
}