package com.example.sample.repository;

import com.example.sample.entity.TNotice81;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice81Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice81 entity
     */
    @Select
    TNotice81 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice81 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice81 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice81 entity);
}