package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MAllPresent;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MAllPresentDao {

    /**
     * @param allPresentId
     * @return the MAllPresent entity
     */
    @Select
    MAllPresent selectById(Integer allPresentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MAllPresent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MAllPresent entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MAllPresent entity);
}