package com.example.sample.repository;

import com.example.sample.entity.TFriendRelationship16;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TFriendRelationship16Dao {

    /**
     * @param accountId
     * @param friendAccountId
     * @return the TFriendRelationship16 entity
     */
    @Select
    TFriendRelationship16 selectById(Integer accountId, Integer friendAccountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TFriendRelationship16 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TFriendRelationship16 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TFriendRelationship16 entity);
}