package com.example.sample.repository;

import com.example.sample.entity.TFriendRelationship7;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TFriendRelationship7Dao {

    /**
     * @param accountId
     * @param friendAccountId
     * @return the TFriendRelationship7 entity
     */
    @Select
    TFriendRelationship7 selectById(Integer accountId, Integer friendAccountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TFriendRelationship7 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TFriendRelationship7 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TFriendRelationship7 entity);
}