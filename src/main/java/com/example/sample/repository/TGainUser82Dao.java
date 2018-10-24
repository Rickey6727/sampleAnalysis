package com.example.sample.repository;

import com.example.sample.entity.TGainUser82;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser82Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser82 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser82 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser82 entity);
}