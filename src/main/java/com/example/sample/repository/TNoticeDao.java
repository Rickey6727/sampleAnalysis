package com.example.sample.repository;

import com.example.sample.entity.TNotice;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNoticeDao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice entity
     */
    @Select
    TNotice selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice entity);
}