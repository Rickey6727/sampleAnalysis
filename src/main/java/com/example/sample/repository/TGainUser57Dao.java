package com.example.sample.repository;

import com.example.sample.entity.TGainUser57;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser57Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser57 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser57 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser57 entity);
}