package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MConsumeItemCountry;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MConsumeItemCountryDao {

    /**
     * @param itemId
     * @param countryCd
     * @return the MConsumeItemCountry entity
     */
    @Select
    MConsumeItemCountry selectById(Integer itemId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MConsumeItemCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MConsumeItemCountry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MConsumeItemCountry entity);
}