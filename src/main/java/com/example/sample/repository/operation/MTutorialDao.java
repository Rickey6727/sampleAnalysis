package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MTutorial;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 */
@ConfigAutowireable
@Dao(config = DomaConfig.class)
public interface MTutorialDao {

    /**
     * @param tutorialId
     * @return the MTutorial entity
     */
    @Select
    Optional<MTutorial> selectById(Integer tutorialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MTutorial entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MTutorial entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MTutorial entity);
}