package com.example.sample.repository;

import com.example.sample.entity.TNotice84;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice84Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice84 entity
     */
    @Select
    TNotice84 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice84 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice84 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice84 entity);
}