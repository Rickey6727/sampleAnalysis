package com.example.sample.repository;

import com.example.sample.entity.TNotice47;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice47Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice47 entity
     */
    @Select
    TNotice47 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice47 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice47 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice47 entity);
}