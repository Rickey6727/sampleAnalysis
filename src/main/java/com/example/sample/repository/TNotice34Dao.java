package com.example.sample.repository;

import com.example.sample.entity.TNotice34;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice34Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice34 entity
     */
    @Select
    TNotice34 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice34 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice34 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice34 entity);
}