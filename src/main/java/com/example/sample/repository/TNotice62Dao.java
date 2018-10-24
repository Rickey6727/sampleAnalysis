package com.example.sample.repository;

import com.example.sample.entity.TNotice62;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice62Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice62 entity
     */
    @Select
    TNotice62 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice62 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice62 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice62 entity);
}