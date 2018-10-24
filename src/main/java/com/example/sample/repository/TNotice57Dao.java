package com.example.sample.repository;

import com.example.sample.entity.TNotice57;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice57Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice57 entity
     */
    @Select
    TNotice57 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice57 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice57 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice57 entity);
}