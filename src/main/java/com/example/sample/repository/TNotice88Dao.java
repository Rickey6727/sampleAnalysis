package com.example.sample.repository;

import com.example.sample.entity.TNotice88;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice88Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice88 entity
     */
    @Select
    TNotice88 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice88 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice88 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice88 entity);
}