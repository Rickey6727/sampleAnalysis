package com.example.sample.repository;

import com.example.sample.entity.TGainUser13;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser13Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser13 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser13 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser13 entity);
}