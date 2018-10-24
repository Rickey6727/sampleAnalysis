package com.example.sample.repository;

import com.example.sample.entity.TGainUser22;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser22Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser22 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser22 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser22 entity);
}