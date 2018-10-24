package com.example.sample.repository;

import com.example.sample.entity.TTutorialState;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TTutorialStateDao {

    /**
     * @param accountId
     * @param tutorialId
     * @return the TTutorialState entity
     */
    @Select
    TTutorialState selectById(Integer accountId, Integer tutorialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TTutorialState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TTutorialState entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TTutorialState entity);
}