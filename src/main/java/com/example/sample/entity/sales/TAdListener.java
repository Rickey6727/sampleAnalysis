package com.example.sample.entity.sales;

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
public class TAdListener implements EntityListener<TAd> {

    @Override
    public void preInsert(TAd entity, PreInsertContext<TAd> context) {
    }

    @Override
    public void preUpdate(TAd entity, PreUpdateContext<TAd> context) {
    }

    @Override
    public void preDelete(TAd entity, PreDeleteContext<TAd> context) {
    }

    @Override
    public void postInsert(TAd entity, PostInsertContext<TAd> context) {
    }

    @Override
    public void postUpdate(TAd entity, PostUpdateContext<TAd> context) {
    }

    @Override
    public void postDelete(TAd entity, PostDeleteContext<TAd> context) {
    }
}