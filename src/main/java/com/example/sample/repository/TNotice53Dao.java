package com.example.sample.repository;

import com.example.sample.entity.TNotice53;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice53Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice53 entity
     */
    @Select
    TNotice53 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice53 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice53 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice53 entity);
}