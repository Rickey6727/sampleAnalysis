package com.example.sample.repository;

import com.example.sample.entity.TGainUser32;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser32Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser32 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser32 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser32 entity);
}