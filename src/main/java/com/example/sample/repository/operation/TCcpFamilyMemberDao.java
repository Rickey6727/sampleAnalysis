package com.example.sample.repository.operation;

import java.util.Optional;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.TCcpFamilyMember;
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
public interface TCcpFamilyMemberDao {

    /**
     * @param applicationId
     * @param accountId
     * @return the TCcpFamilyMember entity
     */
    @Select
    Optional<TCcpFamilyMember> selectById(Integer applicationId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TCcpFamilyMember entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TCcpFamilyMember entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TCcpFamilyMember entity);
}