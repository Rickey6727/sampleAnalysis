package com.example.sample.repository;

import com.example.sample.entity.TDressupAchievement;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TDressupAchievementDao {

    /**
     * @param serialCd
     * @return the TDressupAchievement entity
     */
    @Select
    TDressupAchievement selectById(String serialCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TDressupAchievement entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TDressupAchievement entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TDressupAchievement entity);
}