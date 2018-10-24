package com.example.sample.repository;

import com.example.sample.entity.TNotice50;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice50Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice50 entity
     */
    @Select
    TNotice50 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice50 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice50 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice50 entity);
}