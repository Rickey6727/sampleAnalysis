package com.example.sample.repository;

import com.example.sample.entity.TAccountMigration;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TAccountMigrationDao {

    /**
     * @param accountId
     * @return the TAccountMigration entity
     */
    @Select
    TAccountMigration selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TAccountMigration entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TAccountMigration entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TAccountMigration entity);
}