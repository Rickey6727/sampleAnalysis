package com.example.sample.repository;

import com.example.sample.entity.TCreatorsAchievement;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TCreatorsAchievementDao {

    /**
     * @param accountId
     * @return the TCreatorsAchievement entity
     */
    @Select
    TCreatorsAchievement selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TCreatorsAchievement entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TCreatorsAchievement entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TCreatorsAchievement entity);
}