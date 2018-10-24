package com.example.sample.repository;

import com.example.sample.entity.TNotice22;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice22Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice22 entity
     */
    @Select
    TNotice22 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice22 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice22 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice22 entity);
}