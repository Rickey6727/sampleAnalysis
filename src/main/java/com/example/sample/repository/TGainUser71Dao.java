package com.example.sample.repository;

import com.example.sample.entity.TGainUser71;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser71Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser71 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser71 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser71 entity);
}