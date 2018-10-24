package com.example.sample.repository;

import com.example.sample.entity.TGainUser1;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser1Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser1 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser1 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser1 entity);
}