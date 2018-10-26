package com.example.sample.repository.manage;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.manage.MGachaPush;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MGachaPushDao {

    /**
     * @param gachaPushTypa
     * @param countryCd
     * @return the MGachaPush entity
     */
    @Select
    MGachaPush selectById(Integer gachaPushTypa, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MGachaPush entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MGachaPush entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MGachaPush entity);
}