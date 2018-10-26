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
public class MGachaTermBannerListener implements EntityListener<MGachaTermBanner> {

    @Override
    public void preInsert(MGachaTermBanner entity, PreInsertContext<MGachaTermBanner> context) {
    }

    @Override
    public void preUpdate(MGachaTermBanner entity, PreUpdateContext<MGachaTermBanner> context) {
    }

    @Override
    public void preDelete(MGachaTermBanner entity, PreDeleteContext<MGachaTermBanner> context) {
    }

    @Override
    public void postInsert(MGachaTermBanner entity, PostInsertContext<MGachaTermBanner> context) {
    }

    @Override
    public void postUpdate(MGachaTermBanner entity, PostUpdateContext<MGachaTermBanner> context) {
    }

    @Override
    public void postDelete(MGachaTermBanner entity, PostDeleteContext<MGachaTermBanner> context) {
    }
}