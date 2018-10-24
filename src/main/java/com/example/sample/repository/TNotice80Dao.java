package com.example.sample.repository;

import com.example.sample.entity.TNotice80;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice80Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice80 entity
     */
    @Select
    TNotice80 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice80 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice80 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice80 entity);
}