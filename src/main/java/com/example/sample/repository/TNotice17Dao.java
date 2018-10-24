package com.example.sample.repository;

import com.example.sample.entity.TNotice17;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice17Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice17 entity
     */
    @Select
    TNotice17 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice17 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice17 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice17 entity);
}