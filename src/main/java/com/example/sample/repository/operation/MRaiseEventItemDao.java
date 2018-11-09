package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MRaiseEventItem;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 */
@ConfigAutowireable
@Dao(config = DomaConfig.class)
public interface MRaiseEventItemDao {

    /**
     * @param itemId
     * @return the MRaiseEventItem entity
     */
    @Select
    Optional<MRaiseEventItem> selectById(Integer itemId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MRaiseEventItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MRaiseEventItem entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MRaiseEventItem entity);
}