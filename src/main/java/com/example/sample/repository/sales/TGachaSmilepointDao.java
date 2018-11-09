package com.example.sample.repository.sales;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.sales.TGachaSmilepoint;
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
public interface TGachaSmilepointDao {

    /**
     * @param accountId
     * @return the TGachaSmilepoint entity
     */
    @Select
    Optional<TGachaSmilepoint> selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGachaSmilepoint entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGachaSmilepoint entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGachaSmilepoint entity);
}