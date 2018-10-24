package com.example.sample.repository;

import com.example.sample.entity.TNotice45;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice45Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice45 entity
     */
    @Select
    TNotice45 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice45 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice45 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice45 entity);
}