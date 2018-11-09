package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MEffectItem;
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
public interface MEffectItemDao {

    /**
     * @param itemId
     * @param itemType
     * @return the MEffectItem entity
     */
    @Select
    Optional<MEffectItem> selectById(Integer itemId, Integer itemType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MEffectItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MEffectItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MEffectItem entity);
}