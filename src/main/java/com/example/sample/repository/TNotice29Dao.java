package com.example.sample.repository;

import com.example.sample.entity.TNotice29;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice29Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice29 entity
     */
    @Select
    TNotice29 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice29 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice29 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice29 entity);
}