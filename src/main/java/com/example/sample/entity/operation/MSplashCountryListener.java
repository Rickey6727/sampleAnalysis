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
public class MSplashCountryListener implements EntityListener<MSplashCountry> {

    @Override
    public void preInsert(MSplashCountry entity, PreInsertContext<MSplashCountry> context) {
    }

    @Override
    public void preUpdate(MSplashCountry entity, PreUpdateContext<MSplashCountry> context) {
    }

    @Override
    public void preDelete(MSplashCountry entity, PreDeleteContext<MSplashCountry> context) {
    }

    @Override
    public void postInsert(MSplashCountry entity, PostInsertContext<MSplashCountry> context) {
    }

    @Override
    public void postUpdate(MSplashCountry entity, PostUpdateContext<MSplashCountry> context) {
    }

    @Override
    public void postDelete(MSplashCountry entity, PostDeleteContext<MSplashCountry> context) {
    }
}