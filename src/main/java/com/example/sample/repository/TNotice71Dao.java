package com.example.sample.repository;

import com.example.sample.entity.TNotice71;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice71Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice71 entity
     */
    @Select
    TNotice71 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice71 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice71 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice71 entity);
}