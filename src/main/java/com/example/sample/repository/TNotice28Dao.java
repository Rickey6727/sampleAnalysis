package com.example.sample.repository;

import com.example.sample.entity.TNotice28;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice28Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice28 entity
     */
    @Select
    TNotice28 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice28 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice28 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice28 entity);
}