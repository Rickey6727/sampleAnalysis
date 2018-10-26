package com.example.sample.repository.manage;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.manage.TGinelogHourly;
import java.time.LocalDateTime;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TGinelogHourlyDao {

    /**
     * @param type
     * @param targetTime
     * @return the TGinelogHourly entity
     */
    @Select
    TGinelogHourly selectById(String type, LocalDateTime targetTime);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGinelogHourly entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGinelogHourly entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGinelogHourly entity);
}