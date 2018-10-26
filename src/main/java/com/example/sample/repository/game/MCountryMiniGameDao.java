package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.MCountryMiniGame;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MCountryMiniGameDao {

    /**
     * @param countryCd
     * @param type
     * @param id
     * @return the MCountryMiniGame entity
     */
    @Select
    MCountryMiniGame selectById(Integer countryCd, Integer type, Integer id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MCountryMiniGame entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MCountryMiniGame entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MCountryMiniGame entity);
}