package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.TCcpFamilyMemberApplicant;
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
public interface TCcpFamilyMemberApplicantDao {

    /**
     * @param applicationId
     * @param accountId
     * @return the TCcpFamilyMemberApplicant entity
     */
    @Select
    Optional<TCcpFamilyMemberApplicant> selectById(Integer applicationId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TCcpFamilyMemberApplicant entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TCcpFamilyMemberApplicant entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TCcpFamilyMemberApplicant entity);
}