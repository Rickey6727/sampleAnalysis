package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MTutorialSub;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MTutorialSubDao {

    /**
     * @param tutorialId
     * @param subNumber
     * @return the MTutorialSub entity
     */
    @Select
    MTutorialSub selectById(Integer tutorialId, Integer subNumber);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MTutorialSub entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MTutorialSub entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MTutorialSub entity);
}