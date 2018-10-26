package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MInformationSimple;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MInformationSimpleDao {

    /**
     * @param infoId
     * @return the MInformationSimple entity
     */
    @Select
    MInformationSimple selectById(Integer infoId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MInformationSimple entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MInformationSimple entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MInformationSimple entity);
}