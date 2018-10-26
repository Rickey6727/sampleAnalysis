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
public class MBannerNameCountryListener implements EntityListener<MBannerNameCountry> {

    @Override
    public void preInsert(MBannerNameCountry entity, PreInsertContext<MBannerNameCountry> context) {
    }

    @Override
    public void preUpdate(MBannerNameCountry entity, PreUpdateContext<MBannerNameCountry> context) {
    }

    @Override
    public void preDelete(MBannerNameCountry entity, PreDeleteContext<MBannerNameCountry> context) {
    }

    @Override
    public void postInsert(MBannerNameCountry entity, PostInsertContext<MBannerNameCountry> context) {
    }

    @Override
    public void postUpdate(MBannerNameCountry entity, PostUpdateContext<MBannerNameCountry> context) {
    }

    @Override
    public void postDelete(MBannerNameCountry entity, PostDeleteContext<MBannerNameCountry> context) {
    }
}