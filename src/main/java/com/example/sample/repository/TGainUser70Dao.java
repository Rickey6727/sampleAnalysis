package com.example.sample.repository;

import com.example.sample.entity.TGainUser70;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser70Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser70 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser70 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser70 entity);
}