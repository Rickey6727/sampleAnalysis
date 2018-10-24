package com.example.sample.repository;

import com.example.sample.entity.TNotice63;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice63Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice63 entity
     */
    @Select
    TNotice63 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice63 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice63 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice63 entity);
}