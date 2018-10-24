package com.example.sample.repository;

import com.example.sample.entity.TNotice4;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice4Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice4 entity
     */
    @Select
    TNotice4 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice4 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice4 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice4 entity);
}