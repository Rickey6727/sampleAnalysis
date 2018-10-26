package com.example.sample.repository.operation;

import com.example.sample.config.DomaConfig;
import com.example.sample.entity.operation.MInformation;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DomaConfig.class)
public interface MInformationDao {

    /**
     * @param infoId
     * @param countryCd
     * @return the MInformation entity
     */
    @Select
    MInformation selectById(Integer infoId, Integer countryCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MInformation entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MInformation entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MInformation entity);
}