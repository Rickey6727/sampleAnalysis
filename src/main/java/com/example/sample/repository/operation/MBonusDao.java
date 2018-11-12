package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MBonus;
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
public interface MBonusDao {

    /**
     * @param bonusId
     * @return the MBonus entity
     */
    @Select
    Optional<MBonus> selectById(Integer bonusId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MBonus entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MBonus entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MBonus entity);
}