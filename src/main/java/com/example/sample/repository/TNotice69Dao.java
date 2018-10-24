package com.example.sample.repository;

import com.example.sample.entity.TNotice69;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice69Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice69 entity
     */
    @Select
    TNotice69 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice69 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice69 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice69 entity);
}