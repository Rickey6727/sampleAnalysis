package com.example.sample.repository;

import com.example.sample.entity.TGainUser81;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser81Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser81 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser81 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser81 entity);
}