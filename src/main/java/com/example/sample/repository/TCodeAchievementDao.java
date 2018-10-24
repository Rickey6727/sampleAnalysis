package com.example.sample.repository;

import com.example.sample.entity.TCodeAchievement;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TCodeAchievementDao {

    /**
     * @param accountId
     * @param inputCode
     * @return the TCodeAchievement entity
     */
    @Select
    TCodeAchievement selectById(Integer accountId, String inputCode);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TCodeAchievement entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TCodeAchievement entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TCodeAchievement entity);
}