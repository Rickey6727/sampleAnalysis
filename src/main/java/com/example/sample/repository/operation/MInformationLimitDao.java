package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MInformationLimit;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MInformationLimitDao {

    /**
     * @param limitInformationId
     * @param accountId
     * @return the MInformationLimit entity
     */
    @Select
    MInformationLimit selectById(Integer limitInformationId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MInformationLimit entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MInformationLimit entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MInformationLimit entity);
}