package com.example.sample.repository;

import com.example.sample.entity.TNotice68;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice68Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice68 entity
     */
    @Select
    TNotice68 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice68 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice68 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice68 entity);
}