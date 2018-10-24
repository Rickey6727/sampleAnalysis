package com.example.sample.repository;

import com.example.sample.entity.TNativeInvite;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNativeInviteDao {

    /**
     * @param accountId
     * @return the TNativeInvite entity
     */
    @Select
    TNativeInvite selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNativeInvite entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNativeInvite entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNativeInvite entity);
}