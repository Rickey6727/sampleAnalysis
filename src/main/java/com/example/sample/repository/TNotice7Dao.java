package com.example.sample.repository;

import com.example.sample.entity.TNotice7;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice7Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice7 entity
     */
    @Select
    TNotice7 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice7 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice7 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice7 entity);
}