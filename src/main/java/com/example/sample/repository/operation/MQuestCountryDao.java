package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MQuestCountry;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MQuestCountryDao {

    /**
     * @param questId
     * @param countryCd
     * @return the MQuestCountry entity
     */
    @Select
    MQuestCountry selectById(Integer questId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MQuestCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MQuestCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MQuestCountry entity);
}