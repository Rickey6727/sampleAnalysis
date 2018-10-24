package com.example.sample.repository;

import com.example.sample.entity.TEffectItemOwn;
import java.time.LocalDateTime;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TEffectItemOwnDao {

    /**
     * @param accountId
     * @param itemId
     * @param effectEndDate
     * @return the TEffectItemOwn entity
     */
    @Select
    TEffectItemOwn selectById(Integer accountId, Integer itemId, LocalDateTime effectEndDate);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TEffectItemOwn entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TEffectItemOwn entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TEffectItemOwn entity);
}