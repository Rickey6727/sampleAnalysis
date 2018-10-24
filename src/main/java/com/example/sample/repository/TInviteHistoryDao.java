package com.example.sample.repository;

import com.example.sample.entity.TInviteHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TInviteHistoryDao {

    /**
     * @param accountId
     * @param friendAccountId
     * @return the TInviteHistory entity
     */
    @Select
    TInviteHistory selectById(Integer accountId, Integer friendAccountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TInviteHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TInviteHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TInviteHistory entity);
}