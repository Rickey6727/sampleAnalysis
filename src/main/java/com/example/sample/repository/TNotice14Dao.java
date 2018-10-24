package com.example.sample.repository;

import com.example.sample.entity.TNotice14;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice14Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice14 entity
     */
    @Select
    TNotice14 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice14 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice14 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice14 entity);
}