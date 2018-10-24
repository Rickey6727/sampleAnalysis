package com.example.sample.repository;

import com.example.sample.entity.TGainUser2;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser2Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser2 entity);
}