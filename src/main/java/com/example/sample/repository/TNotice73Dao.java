package com.example.sample.repository;

import com.example.sample.entity.TNotice73;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice73Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice73 entity
     */
    @Select
    TNotice73 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice73 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice73 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice73 entity);
}