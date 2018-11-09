package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MInvite;
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
public interface MInviteDao {

    /**
     * @param inviteId
     * @return the MInvite entity
     */
    @Select
    Optional<MInvite> selectById(Integer inviteId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MInvite entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MInvite entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MInvite entity);
}