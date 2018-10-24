package com.example.sample.repository;

import com.example.sample.entity.TNotice35;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice35Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice35 entity
     */
    @Select
    TNotice35 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice35 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice35 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice35 entity);
}