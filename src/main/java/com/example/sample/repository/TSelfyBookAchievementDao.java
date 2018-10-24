package com.example.sample.repository;

import com.example.sample.entity.TSelfyBookAchievement;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TSelfyBookAchievementDao {

    /**
     * @param serialCd
     * @return the TSelfyBookAchievement entity
     */
    @Select
    TSelfyBookAchievement selectById(String serialCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TSelfyBookAchievement entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TSelfyBookAchievement entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TSelfyBookAchievement entity);
}