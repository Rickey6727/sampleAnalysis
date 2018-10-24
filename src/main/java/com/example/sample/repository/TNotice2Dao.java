package com.example.sample.repository;

import com.example.sample.entity.TNotice2;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice2Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice2 entity
     */
    @Select
    TNotice2 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice2 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice2 entity);
}