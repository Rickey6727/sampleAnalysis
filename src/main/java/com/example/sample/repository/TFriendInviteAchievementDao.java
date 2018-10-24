package com.example.sample.repository;

import com.example.sample.entity.TFriendInviteAchievement;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TFriendInviteAchievementDao {

    /**
     * @param accountId
     * @return the TFriendInviteAchievement entity
     */
    @Select
    TFriendInviteAchievement selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TFriendInviteAchievement entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TFriendInviteAchievement entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TFriendInviteAchievement entity);
}