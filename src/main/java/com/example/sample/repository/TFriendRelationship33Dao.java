package com.example.sample.repository;

import com.example.sample.entity.TFriendRelationship33;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TFriendRelationship33Dao {

    /**
     * @param accountId
     * @param friendAccountId
     * @return the TFriendRelationship33 entity
     */
    @Select
    TFriendRelationship33 selectById(Integer accountId, Integer friendAccountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TFriendRelationship33 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TFriendRelationship33 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TFriendRelationship33 entity);
}