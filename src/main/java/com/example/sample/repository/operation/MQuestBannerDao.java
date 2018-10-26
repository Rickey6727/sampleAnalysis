package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MQuestBanner;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MQuestBannerDao {

    /**
     * @param questId
     * @param displayOrder
     * @return the MQuestBanner entity
     */
    @Select
    MQuestBanner selectById(Integer questId, Integer displayOrder);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MQuestBanner entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MQuestBanner entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MQuestBanner entity);
}