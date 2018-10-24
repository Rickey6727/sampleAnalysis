package com.example.sample.repository;

import com.example.sample.entity.TNotice25;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice25Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice25 entity
     */
    @Select
    TNotice25 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice25 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice25 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice25 entity);
}