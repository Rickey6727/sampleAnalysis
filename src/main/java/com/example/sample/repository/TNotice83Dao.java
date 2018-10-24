package com.example.sample.repository;

import com.example.sample.entity.TNotice83;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice83Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice83 entity
     */
    @Select
    TNotice83 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice83 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice83 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice83 entity);
}