package com.example.sample.repository;

import com.example.sample.entity.TNotice39;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice39Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice39 entity
     */
    @Select
    TNotice39 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice39 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice39 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice39 entity);
}