package com.example.sample.repository;

import com.example.sample.entity.TNotice21;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice21Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice21 entity
     */
    @Select
    TNotice21 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice21 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice21 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice21 entity);
}