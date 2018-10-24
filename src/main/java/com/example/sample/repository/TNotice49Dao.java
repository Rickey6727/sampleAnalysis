package com.example.sample.repository;

import com.example.sample.entity.TNotice49;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice49Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice49 entity
     */
    @Select
    TNotice49 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice49 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice49 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice49 entity);
}