package com.example.sample.repository;

import com.example.sample.entity.TNotice40;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice40Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice40 entity
     */
    @Select
    TNotice40 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice40 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice40 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice40 entity);
}