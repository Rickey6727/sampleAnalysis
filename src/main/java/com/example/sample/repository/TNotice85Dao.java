package com.example.sample.repository;

import com.example.sample.entity.TNotice85;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice85Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice85 entity
     */
    @Select
    TNotice85 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice85 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice85 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice85 entity);
}