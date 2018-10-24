package com.example.sample.repository;

import com.example.sample.entity.TNotice27;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice27Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice27 entity
     */
    @Select
    TNotice27 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice27 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice27 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice27 entity);
}