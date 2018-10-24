package com.example.sample.repository;

import com.example.sample.entity.TNotice24;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice24Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice24 entity
     */
    @Select
    TNotice24 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice24 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice24 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice24 entity);
}