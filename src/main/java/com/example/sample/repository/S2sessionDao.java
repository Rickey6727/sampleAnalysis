package com.example.sample.repository;

import com.example.sample.entity.S2session;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface S2sessionDao {

    /**
     * @param sessionId
     * @param name
     * @return the S2session entity
     */
    @Select
    S2session selectById(String sessionId, String name);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(S2session entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(S2session entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(S2session entity);
}