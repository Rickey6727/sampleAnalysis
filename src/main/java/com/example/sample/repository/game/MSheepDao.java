package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.MSheep;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MSheepDao {

    /**
     * @param sheepId
     * @return the MSheep entity
     */
    @Select
    MSheep selectById(Integer sheepId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MSheep entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MSheep entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MSheep entity);
}