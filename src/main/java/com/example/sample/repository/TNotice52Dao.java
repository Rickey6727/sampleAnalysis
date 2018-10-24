package com.example.sample.repository;

import com.example.sample.entity.TNotice52;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice52Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice52 entity
     */
    @Select
    TNotice52 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice52 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice52 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice52 entity);
}