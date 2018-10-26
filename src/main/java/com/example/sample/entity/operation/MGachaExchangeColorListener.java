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
public class MGachaExchangeColorListener implements EntityListener<MGachaExchangeColor> {

    @Override
    public void preInsert(MGachaExchangeColor entity, PreInsertContext<MGachaExchangeColor> context) {
    }

    @Override
    public void preUpdate(MGachaExchangeColor entity, PreUpdateContext<MGachaExchangeColor> context) {
    }

    @Override
    public void preDelete(MGachaExchangeColor entity, PreDeleteContext<MGachaExchangeColor> context) {
    }

    @Override
    public void postInsert(MGachaExchangeColor entity, PostInsertContext<MGachaExchangeColor> context) {
    }

    @Override
    public void postUpdate(MGachaExchangeColor entity, PostUpdateContext<MGachaExchangeColor> context) {
    }

    @Override
    public void postDelete(MGachaExchangeColor entity, PostDeleteContext<MGachaExchangeColor> context) {
    }
}