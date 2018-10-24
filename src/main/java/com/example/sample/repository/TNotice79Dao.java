package com.example.sample.repository;

import com.example.sample.entity.TNotice79;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice79Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice79 entity
     */
    @Select
    TNotice79 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice79 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice79 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice79 entity);
}