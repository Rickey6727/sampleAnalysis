package com.example.sample.repository;

import com.example.sample.entity.TNotice51;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice51Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice51 entity
     */
    @Select
    TNotice51 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice51 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice51 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice51 entity);
}