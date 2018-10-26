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
public class MGachaExchangeListener implements EntityListener<MGachaExchange> {

    @Override
    public void preInsert(MGachaExchange entity, PreInsertContext<MGachaExchange> context) {
    }

    @Override
    public void preUpdate(MGachaExchange entity, PreUpdateContext<MGachaExchange> context) {
    }

    @Override
    public void preDelete(MGachaExchange entity, PreDeleteContext<MGachaExchange> context) {
    }

    @Override
    public void postInsert(MGachaExchange entity, PostInsertContext<MGachaExchange> context) {
    }

    @Override
    public void postUpdate(MGachaExchange entity, PostUpdateContext<MGachaExchange> context) {
    }

    @Override
    public void postDelete(MGachaExchange entity, PostDeleteContext<MGachaExchange> context) {
    }
}