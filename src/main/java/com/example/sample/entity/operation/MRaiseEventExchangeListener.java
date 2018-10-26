package com.example.sample.entity.operation;

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
public class MRaiseEventExchangeListener implements EntityListener<MRaiseEventExchange> {

    @Override
    public void preInsert(MRaiseEventExchange entity, PreInsertContext<MRaiseEventExchange> context) {
    }

    @Override
    public void preUpdate(MRaiseEventExchange entity, PreUpdateContext<MRaiseEventExchange> context) {
    }

    @Override
    public void preDelete(MRaiseEventExchange entity, PreDeleteContext<MRaiseEventExchange> context) {
    }

    @Override
    public void postInsert(MRaiseEventExchange entity, PostInsertContext<MRaiseEventExchange> context) {
    }

    @Override
    public void postUpdate(MRaiseEventExchange entity, PostUpdateContext<MRaiseEventExchange> context) {
    }

    @Override
    public void postDelete(MRaiseEventExchange entity, PostDeleteContext<MRaiseEventExchange> context) {
    }
}