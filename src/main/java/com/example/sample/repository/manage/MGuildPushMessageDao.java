package com.example.sample.repository.manage;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.manage.MGuildPushMessage;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MGuildPushMessageDao {

    /**
     * @param guildPushType
     * @param countryCd
     * @return the MGuildPushMessage entity
     */
    @Select
    MGuildPushMessage selectById(Integer guildPushType, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGuildPushMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGuildPushMessage entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGuildPushMessage entity);
}