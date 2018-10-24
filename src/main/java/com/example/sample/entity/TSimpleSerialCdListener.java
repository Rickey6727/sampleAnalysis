package com.example.sample.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * 
 */
public class TSimpleSerialCdListener implements EntityListener<TSimpleSerialCd> {

    @Override
    public void preInsert(TSimpleSerialCd entity, PreInsertContext<TSimpleSerialCd> context) {
    }

    @Override
    public void preUpdate(TSimpleSerialCd entity, PreUpdateContext<TSimpleSerialCd> context) {
    }

    @Override
    public void preDelete(TSimpleSerialCd entity, PreDeleteContext<TSimpleSerialCd> context) {
    }

    @Override
    public void postInsert(TSimpleSerialCd entity, PostInsertContext<TSimpleSerialCd> context) {
    }

    @Override
    public void postUpdate(TSimpleSerialCd entity, PostUpdateContext<TSimpleSerialCd> context) {
    }

    @Override
    public void postDelete(TSimpleSerialCd entity, PostDeleteContext<TSimpleSerialCd> context) {
    }
}