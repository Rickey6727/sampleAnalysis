package com.example.sample.repository;

import com.example.sample.entity.TNotice89;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice89Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice89 entity
     */
    @Select
    TNotice89 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice89 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice89 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice89 entity);
}