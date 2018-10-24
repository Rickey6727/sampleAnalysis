package com.example.sample.repository;

import com.example.sample.entity.TNotice56;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice56Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice56 entity
     */
    @Select
    TNotice56 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice56 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice56 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice56 entity);
}