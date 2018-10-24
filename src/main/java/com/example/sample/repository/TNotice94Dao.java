package com.example.sample.repository;

import com.example.sample.entity.TNotice94;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice94Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice94 entity
     */
    @Select
    TNotice94 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice94 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice94 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice94 entity);
}