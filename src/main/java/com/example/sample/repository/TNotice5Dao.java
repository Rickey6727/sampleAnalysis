package com.example.sample.repository;

import com.example.sample.entity.TNotice5;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice5Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice5 entity
     */
    @Select
    TNotice5 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice5 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice5 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice5 entity);
}