package com.example.sample.repository;

import com.example.sample.entity.TNotice78;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice78Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice78 entity
     */
    @Select
    TNotice78 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice78 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice78 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice78 entity);
}