package com.example.sample.repository;

import com.example.sample.entity.TNotice72;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice72Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice72 entity
     */
    @Select
    TNotice72 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice72 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice72 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice72 entity);
}