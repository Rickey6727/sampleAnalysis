package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.TCcpFamilyPresentCount;
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
public interface TCcpFamilyPresentCountDao {

    /**
     * @param applicationId
     * @param familyAccountId
     * @return the TCcpFamilyPresentCount entity
     */
    @Select
    Optional<TCcpFamilyPresentCount> selectById(Integer applicationId, Integer familyAccountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TCcpFamilyPresentCount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TCcpFamilyPresentCount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TCcpFamilyPresentCount entity);
}