package com.example.sample.repository;

import com.example.sample.entity.TNotice61;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice61Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice61 entity
     */
    @Select
    TNotice61 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice61 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice61 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice61 entity);
}