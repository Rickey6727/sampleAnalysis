package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.TStableState;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TStableStateDao {

    /**
     * @param accountId
     * @param stableId
     * @return the TStableState entity
     */
    @Select
    TStableState selectById(Integer accountId, Integer stableId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TStableState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TStableState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TStableState entity);
}