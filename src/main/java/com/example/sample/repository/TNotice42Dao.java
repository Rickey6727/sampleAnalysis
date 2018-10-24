package com.example.sample.repository;

import com.example.sample.entity.TNotice42;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice42Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice42 entity
     */
    @Select
    TNotice42 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice42 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice42 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice42 entity);
}