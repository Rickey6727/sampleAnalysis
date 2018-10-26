package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MNpcMessage;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MNpcMessageDao {

    /**
     * @param npcAccountId
     * @param countryCd
     * @param townRank
     * @param questId
     * @return the MNpcMessage entity
     */
    @Select
    MNpcMessage selectById(Integer npcAccountId, Integer countryCd, Integer townRank, Integer questId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MNpcMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MNpcMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MNpcMessage entity);
}