package com.example.sample.repository;

import com.example.sample.entity.TAccountBasicInfo;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TAccountBasicInfoDao {

    /**
     * @param accountId
     * @return the TAccountBasicInfo entity
     */
    @Select
    TAccountBasicInfo selectById(Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TAccountBasicInfo entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TAccountBasicInfo entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TAccountBasicInfo entity);
}