package com.example.sample.repository;

import com.example.sample.entity.TNotice18;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice18Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice18 entity
     */
    @Select
    TNotice18 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice18 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice18 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice18 entity);
}