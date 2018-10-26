package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MCcpFamilyApply;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MCcpFamilyApplyDao {

    /**
     * @param applicationId
     * @return the MCcpFamilyApply entity
     */
    @Select
    MCcpFamilyApply selectById(Integer applicationId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MCcpFamilyApply entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MCcpFamilyApply entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MCcpFamilyApply entity);
}