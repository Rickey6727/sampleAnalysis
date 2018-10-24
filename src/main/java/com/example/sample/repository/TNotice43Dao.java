package com.example.sample.repository;

import com.example.sample.entity.TNotice43;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice43Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice43 entity
     */
    @Select
    TNotice43 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice43 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice43 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice43 entity);
}