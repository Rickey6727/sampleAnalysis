package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.MAppearance;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MAppearanceDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MAppearance entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MAppearance entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MAppearance entity);
}