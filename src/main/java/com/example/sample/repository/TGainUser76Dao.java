package com.example.sample.repository;

import com.example.sample.entity.TGainUser76;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser76Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser76 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser76 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser76 entity);
}