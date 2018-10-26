package com.example.sample.repository.manage;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.manage.TPushReserve;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TPushReserveDao {

    /**
     * @param serialId
     * @return the TPushReserve entity
     */
    @Select
    TPushReserve selectById(Long serialId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPushReserve entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPushReserve entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPushReserve entity);
}