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
public class MNpcNameCountryListener implements EntityListener<MNpcNameCountry> {

    @Override
    public void preInsert(MNpcNameCountry entity, PreInsertContext<MNpcNameCountry> context) {
    }

    @Override
    public void preUpdate(MNpcNameCountry entity, PreUpdateContext<MNpcNameCountry> context) {
    }

    @Override
    public void preDelete(MNpcNameCountry entity, PreDeleteContext<MNpcNameCountry> context) {
    }

    @Override
    public void postInsert(MNpcNameCountry entity, PostInsertContext<MNpcNameCountry> context) {
    }

    @Override
    public void postUpdate(MNpcNameCountry entity, PostUpdateContext<MNpcNameCountry> context) {
    }

    @Override
    public void postDelete(MNpcNameCountry entity, PostDeleteContext<MNpcNameCountry> context) {
    }
}