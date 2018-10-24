package com.example.sample.repository;

import com.example.sample.entity.TNotice95;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice95Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice95 entity
     */
    @Select
    TNotice95 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice95 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice95 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice95 entity);
}