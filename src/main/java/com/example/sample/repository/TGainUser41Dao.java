package com.example.sample.repository;

import com.example.sample.entity.TGainUser41;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser41Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser41 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser41 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser41 entity);
}