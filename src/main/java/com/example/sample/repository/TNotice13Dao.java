package com.example.sample.repository;

import com.example.sample.entity.TNotice13;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice13Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice13 entity
     */
    @Select
    TNotice13 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice13 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice13 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice13 entity);
}