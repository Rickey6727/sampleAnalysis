package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.MSheepSpeed;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MSheepSpeedDao {

    /**
     * @param sheepId
     * @param speed
     * @return the MSheepSpeed entity
     */
    @Select
    MSheepSpeed selectById(Integer sheepId, Integer speed);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MSheepSpeed entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MSheepSpeed entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MSheepSpeed entity);
}