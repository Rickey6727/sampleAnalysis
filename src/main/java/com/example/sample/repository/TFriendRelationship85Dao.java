package com.example.sample.repository;

import com.example.sample.entity.TFriendRelationship85;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TFriendRelationship85Dao {

    /**
     * @param accountId
     * @param friendAccountId
     * @return the TFriendRelationship85 entity
     */
    @Select
    TFriendRelationship85 selectById(Integer accountId, Integer friendAccountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TFriendRelationship85 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TFriendRelationship85 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TFriendRelationship85 entity);
}