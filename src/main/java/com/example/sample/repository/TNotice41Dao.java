package com.example.sample.repository;

import com.example.sample.entity.TNotice41;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice41Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice41 entity
     */
    @Select
    TNotice41 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice41 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice41 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice41 entity);
}