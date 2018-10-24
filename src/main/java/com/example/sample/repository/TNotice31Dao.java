package com.example.sample.repository;

import com.example.sample.entity.TNotice31;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice31Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice31 entity
     */
    @Select
    TNotice31 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice31 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice31 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice31 entity);
}