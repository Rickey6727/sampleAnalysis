package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.MStable;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MStableDao {

    /**
     * @param stableId
     * @return the MStable entity
     */
    @Select
    MStable selectById(Integer stableId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MStable entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MStable entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MStable entity);
}