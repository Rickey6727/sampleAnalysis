package com.example.sample.repository;

import com.example.sample.entity.TGainUser43;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser43Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser43 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser43 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser43 entity);
}