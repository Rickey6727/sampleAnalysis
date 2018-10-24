package com.example.sample.repository;

import com.example.sample.entity.TNotice74;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice74Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice74 entity
     */
    @Select
    TNotice74 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice74 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice74 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice74 entity);
}