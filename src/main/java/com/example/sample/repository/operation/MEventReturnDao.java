package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MEventReturn;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MEventReturnDao {

    /**
     * @param eventId
     * @param returnNo
     * @return the MEventReturn entity
     */
    @Select
    MEventReturn selectById(Integer eventId, Short returnNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MEventReturn entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MEventReturn entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MEventReturn entity);
}