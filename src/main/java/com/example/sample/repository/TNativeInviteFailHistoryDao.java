package com.example.sample.repository;

import com.example.sample.entity.TNativeInviteFailHistory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNativeInviteFailHistoryDao {

    /**
     * @param accountId
     * @return the TNativeInviteFailHistory entity
     */
    @Select
    TNativeInviteFailHistory selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNativeInviteFailHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNativeInviteFailHistory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNativeInviteFailHistory entity);
}