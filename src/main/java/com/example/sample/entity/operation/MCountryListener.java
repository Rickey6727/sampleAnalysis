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
public class MCountryListener implements EntityListener<MCountry> {

    @Override
    public void preInsert(MCountry entity, PreInsertContext<MCountry> context) {
    }

    @Override
    public void preUpdate(MCountry entity, PreUpdateContext<MCountry> context) {
    }

    @Override
    public void preDelete(MCountry entity, PreDeleteContext<MCountry> context) {
    }

    @Override
    public void postInsert(MCountry entity, PostInsertContext<MCountry> context) {
    }

    @Override
    public void postUpdate(MCountry entity, PostUpdateContext<MCountry> context) {
    }

    @Override
    public void postDelete(MCountry entity, PostDeleteContext<MCountry> context) {
    }
}