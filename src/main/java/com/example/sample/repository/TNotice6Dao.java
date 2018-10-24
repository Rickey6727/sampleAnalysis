package com.example.sample.repository;

import com.example.sample.entity.TNotice6;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice6Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice6 entity
     */
    @Select
    TNotice6 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice6 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice6 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice6 entity);
}