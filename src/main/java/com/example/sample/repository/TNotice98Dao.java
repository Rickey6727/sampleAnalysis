package com.example.sample.repository;

import com.example.sample.entity.TNotice98;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice98Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice98 entity
     */
    @Select
    TNotice98 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice98 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice98 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice98 entity);
}