package com.example.sample.repository;

import com.example.sample.entity.TNotice55;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice55Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice55 entity
     */
    @Select
    TNotice55 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice55 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice55 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice55 entity);
}