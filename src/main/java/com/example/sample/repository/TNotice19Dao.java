package com.example.sample.repository;

import com.example.sample.entity.TNotice19;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice19Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice19 entity
     */
    @Select
    TNotice19 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice19 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice19 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice19 entity);
}