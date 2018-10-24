package com.example.sample.repository;

import com.example.sample.entity.TNotice82;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice82Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice82 entity
     */
    @Select
    TNotice82 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice82 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice82 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice82 entity);
}