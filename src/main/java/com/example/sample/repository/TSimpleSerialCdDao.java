package com.example.sample.repository;

import com.example.sample.entity.TSimpleSerialCd;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = ${configClassName}.class)
public interface TSimpleSerialCdDao {

    /**
     * @param targetId
     * @param serialCd
     * @return the TSimpleSerialCd entity
     */
    @Select
    TSimpleSerialCd selectById(Integer targetId, String serialCd);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TSimpleSerialCd entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TSimpleSerialCd entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TSimpleSerialCd entity);
}