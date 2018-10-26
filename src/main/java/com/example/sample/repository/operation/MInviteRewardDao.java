package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MInviteReward;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MInviteRewardDao {

    /**
     * @param inviteId
     * @param inviteNum
     * @param goodsNo
     * @return the MInviteReward entity
     */
    @Select
    MInviteReward selectById(Integer inviteId, Integer inviteNum, Integer goodsNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MInviteReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MInviteReward entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MInviteReward entity);
}