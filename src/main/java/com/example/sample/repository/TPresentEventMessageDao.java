package com.example.sample.repository;

import com.example.sample.entity.TPresentEventMessage;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TPresentEventMessageDao {

    /**
     * @param accountId
     * @param mAccountId
     * @return the TPresentEventMessage entity
     */
    @Select
    TPresentEventMessage selectById(Integer accountId, Integer mAccountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TPresentEventMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TPresentEventMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TPresentEventMessage entity);
}