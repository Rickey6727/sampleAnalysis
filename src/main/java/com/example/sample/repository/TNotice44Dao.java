package com.example.sample.repository;

import com.example.sample.entity.TNotice44;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice44Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice44 entity
     */
    @Select
    TNotice44 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice44 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice44 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice44 entity);
}