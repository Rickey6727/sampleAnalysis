package com.example.sample.repository;

import com.example.sample.entity.TNotice1;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice1Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice1 entity
     */
    @Select
    TNotice1 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice1 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice1 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice1 entity);
}