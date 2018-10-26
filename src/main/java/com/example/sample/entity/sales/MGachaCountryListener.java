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
public class MGachaCountryListener implements EntityListener<MGachaCountry> {

    @Override
    public void preInsert(MGachaCountry entity, PreInsertContext<MGachaCountry> context) {
    }

    @Override
    public void preUpdate(MGachaCountry entity, PreUpdateContext<MGachaCountry> context) {
    }

    @Override
    public void preDelete(MGachaCountry entity, PreDeleteContext<MGachaCountry> context) {
    }

    @Override
    public void postInsert(MGachaCountry entity, PostInsertContext<MGachaCountry> context) {
    }

    @Override
    public void postUpdate(MGachaCountry entity, PostUpdateContext<MGachaCountry> context) {
    }

    @Override
    public void postDelete(MGachaCountry entity, PostDeleteContext<MGachaCountry> context) {
    }
}