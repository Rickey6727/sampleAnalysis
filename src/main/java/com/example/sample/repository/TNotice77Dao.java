package com.example.sample.repository;

import com.example.sample.entity.TNotice77;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice77Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice77 entity
     */
    @Select
    TNotice77 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice77 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice77 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice77 entity);
}