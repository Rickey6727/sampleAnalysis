package com.example.sample.repository;

import com.example.sample.entity.TGainUser96;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser96Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser96 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser96 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser96 entity);
}