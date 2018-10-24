package com.example.sample.repository;

import com.example.sample.entity.TNotice30;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice30Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice30 entity
     */
    @Select
    TNotice30 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice30 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice30 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice30 entity);
}