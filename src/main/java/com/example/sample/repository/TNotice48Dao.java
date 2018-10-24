package com.example.sample.repository;

import com.example.sample.entity.TNotice48;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice48Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice48 entity
     */
    @Select
    TNotice48 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice48 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice48 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice48 entity);
}