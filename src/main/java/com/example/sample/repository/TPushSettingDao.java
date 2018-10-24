package com.example.sample.repository;

import com.example.sample.entity.TPushSetting;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPushSettingDao {

    /**
     * @param accountId
     * @param pushType
     * @return the TPushSetting entity
     */
    @Select
    TPushSetting selectById(Integer accountId, Integer pushType);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPushSetting entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPushSetting entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPushSetting entity);
}