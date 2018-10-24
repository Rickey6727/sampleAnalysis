package com.example.sample.repository;

import com.example.sample.entity.TNotice92;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice92Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice92 entity
     */
    @Select
    TNotice92 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice92 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice92 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice92 entity);
}