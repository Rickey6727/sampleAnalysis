package com.example.sample.repository.manage;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.manage.TManageUser;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TManageUserDao {

    /**
     * @param userId
     * @return the TManageUser entity
     */
    @Select
    TManageUser selectById(String userId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TManageUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TManageUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TManageUser entity);
}