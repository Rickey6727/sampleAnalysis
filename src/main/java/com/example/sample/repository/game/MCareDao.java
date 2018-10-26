package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.MCare;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MCareDao {

    /**
     * @param careId
     * @return the MCare entity
     */
    @Select
    MCare selectById(Integer careId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MCare entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MCare entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MCare entity);
}