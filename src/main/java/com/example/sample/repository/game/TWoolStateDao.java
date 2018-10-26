package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.TWoolState;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TWoolStateDao {

    /**
     * @param accountId
     * @return the TWoolState entity
     */
    @Select
    TWoolState selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TWoolState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TWoolState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TWoolState entity);
}