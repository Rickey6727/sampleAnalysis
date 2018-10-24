package com.example.sample.repository;

import com.example.sample.entity.TGainUser3;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser3Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser3 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser3 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser3 entity);
}