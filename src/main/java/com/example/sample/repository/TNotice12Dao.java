package com.example.sample.repository;

import com.example.sample.entity.TNotice12;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice12Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice12 entity
     */
    @Select
    TNotice12 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice12 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice12 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice12 entity);
}