package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MCoinEventUrl;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MCoinEventUrlDao {

    /**
     * @param eventId
     * @param countryCd
     * @return the MCoinEventUrl entity
     */
    @Select
    MCoinEventUrl selectById(Integer eventId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MCoinEventUrl entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MCoinEventUrl entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MCoinEventUrl entity);
}