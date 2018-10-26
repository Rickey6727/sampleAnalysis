package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MTipsMessage;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MTipsMessageDao {

    /**
     * @param tipsId
     * @param coutryCd
     * @return the MTipsMessage entity
     */
    @Select
    MTipsMessage selectById(Integer tipsId, Integer coutryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MTipsMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MTipsMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MTipsMessage entity);
}