package com.example.sample.repository;

import com.example.sample.entity.TGainUser37;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TGainUser37Dao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGainUser37 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGainUser37 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGainUser37 entity);
}