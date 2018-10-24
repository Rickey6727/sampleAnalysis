package com.example.sample.repository;

import com.example.sample.entity.TNotice70;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice70Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice70 entity
     */
    @Select
    TNotice70 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice70 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice70 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice70 entity);
}