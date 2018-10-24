package com.example.sample.repository;

import com.example.sample.entity.TGainUser12;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser12Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser12 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser12 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser12 entity);
}