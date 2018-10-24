package com.example.sample.repository;

import com.example.sample.entity.TNotice90;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice90Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice90 entity
     */
    @Select
    TNotice90 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice90 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice90 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice90 entity);
}