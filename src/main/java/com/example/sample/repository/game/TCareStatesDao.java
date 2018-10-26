package com.example.sample.repository.game;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.game.TCareStates;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TCareStatesDao {

    /**
     * @param accountId
     * @param frameId
     * @return the TCareStates entity
     */
    @Select
    TCareStates selectById(Integer accountId, Integer frameId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TCareStates entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TCareStates entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TCareStates entity);
}