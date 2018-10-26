package com.example.sample.repository.manage;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.manage.TGinelogDaily;
import java.time.LocalDate;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface TGinelogDailyDao {

    /**
     * @param type
     * @param targetDate
     * @return the TGinelogDaily entity
     */
    @Select
    TGinelogDaily selectById(String type, LocalDate targetDate);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TGinelogDaily entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TGinelogDaily entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TGinelogDaily entity);
}