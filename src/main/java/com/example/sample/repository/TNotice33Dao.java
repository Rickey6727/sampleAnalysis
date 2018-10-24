package com.example.sample.repository;

import com.example.sample.entity.TNotice33;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice33Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice33 entity
     */
    @Select
    TNotice33 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice33 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice33 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice33 entity);
}