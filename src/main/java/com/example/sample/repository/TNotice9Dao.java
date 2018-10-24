package com.example.sample.repository;

import com.example.sample.entity.TNotice9;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice9Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice9 entity
     */
    @Select
    TNotice9 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice9 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice9 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice9 entity);
}