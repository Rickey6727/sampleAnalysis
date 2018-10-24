package com.example.sample.repository;

import com.example.sample.entity.TGainUser97;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser97Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser97 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser97 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser97 entity);
}