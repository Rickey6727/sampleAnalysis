package com.example.sample.repository;

import com.example.sample.entity.TNotice97;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice97Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice97 entity
     */
    @Select
    TNotice97 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice97 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice97 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice97 entity);
}