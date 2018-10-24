package com.example.sample.repository;

import com.example.sample.entity.TNotice76;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice76Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice76 entity
     */
    @Select
    TNotice76 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice76 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice76 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice76 entity);
}