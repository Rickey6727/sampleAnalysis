package com.example.sample.repository;

import com.example.sample.entity.TGainUser46;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser46Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser46 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser46 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser46 entity);
}