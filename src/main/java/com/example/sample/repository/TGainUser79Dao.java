package com.example.sample.repository;

import com.example.sample.entity.TGainUser79;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser79Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser79 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser79 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser79 entity);
}