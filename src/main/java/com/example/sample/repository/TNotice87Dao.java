package com.example.sample.repository;

import com.example.sample.entity.TNotice87;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TNotice87Dao {

    /**
     * @param noticeId
     * @param accountId
     * @return the TNotice87 entity
     */
    @Select
    TNotice87 selectById(Long noticeId, Integer accountId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TNotice87 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TNotice87 entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TNotice87 entity);
}