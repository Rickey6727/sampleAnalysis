package com.example.sample.repository;

import com.example.sample.entity.TGainUser23;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser23Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser23 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser23 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser23 entity);
}