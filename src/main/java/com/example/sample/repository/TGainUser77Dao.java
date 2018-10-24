package com.example.sample.repository;

import com.example.sample.entity.TGainUser77;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser77Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser77 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser77 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser77 entity);
}