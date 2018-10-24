package com.example.sample.repository;

import com.example.sample.entity.TNotice8;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice8Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice8 entity
     */
    @Select
    TNotice8 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice8 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice8 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice8 entity);
}