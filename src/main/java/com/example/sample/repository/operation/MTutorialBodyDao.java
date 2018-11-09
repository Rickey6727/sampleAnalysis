package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MTutorialBody;
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
public interface MTutorialBodyDao {

    /**
     * @param tutorialId
     * @param tutorialBodyType
     * @return the MTutorialBody entity
     */
    @Select
    Optional<MTutorialBody> selectById(Integer tutorialId, Integer tutorialBodyType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MTutorialBody entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MTutorialBody entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MTutorialBody entity);
}