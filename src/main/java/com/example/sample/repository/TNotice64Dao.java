package com.example.sample.repository;

import com.example.sample.entity.TNotice64;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice64Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice64 entity
     */
    @Select
    TNotice64 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice64 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice64 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice64 entity);
}