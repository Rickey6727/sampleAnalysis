package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MCcpFamily;
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
public interface MCcpFamilyDao {

    /**
     * @param applicationId
     * @return the MCcpFamily entity
     */
    @Select
    Optional<MCcpFamily> selectById(Integer applicationId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MCcpFamily entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MCcpFamily entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MCcpFamily entity);
}