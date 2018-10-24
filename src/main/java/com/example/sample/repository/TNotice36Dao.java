package com.example.sample.repository;

import com.example.sample.entity.TNotice36;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice36Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice36 entity
     */
    @Select
    TNotice36 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice36 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice36 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice36 entity);
}