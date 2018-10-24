package com.example.sample.repository;

import com.example.sample.entity.TNotice32;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice32Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice32 entity
     */
    @Select
    TNotice32 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice32 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice32 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice32 entity);
}