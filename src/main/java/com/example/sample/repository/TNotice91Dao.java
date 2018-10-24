package com.example.sample.repository;

import com.example.sample.entity.TNotice91;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice91Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice91 entity
     */
    @Select
    TNotice91 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice91 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice91 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice91 entity);
}