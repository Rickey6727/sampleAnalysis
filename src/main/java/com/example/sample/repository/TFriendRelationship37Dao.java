package com.example.sample.repository;

import com.example.sample.entity.TFriendRelationship37;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TFriendRelationship37Dao {

    /**
     * @param accountId
     * @param friendAccountId
     * @return the TFriendRelationship37 entity
     */
    @Select
    TFriendRelationship37 selectById(Integer accountId, Integer friendAccountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TFriendRelationship37 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TFriendRelationship37 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TFriendRelationship37 entity);
}