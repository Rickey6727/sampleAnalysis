package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MInviteGuestReward;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MInviteGuestRewardDao {

    /**
     * @param inviteId
     * @param goodsNo
     * @return the MInviteGuestReward entity
     */
    @Select
    MInviteGuestReward selectById(Integer inviteId, Integer goodsNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MInviteGuestReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MInviteGuestReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MInviteGuestReward entity);
}