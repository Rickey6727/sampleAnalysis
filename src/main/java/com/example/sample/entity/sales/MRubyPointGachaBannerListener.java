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
public class MRubyPointGachaBannerListener implements EntityListener<MRubyPointGachaBanner> {

    @Override
    public void preInsert(MRubyPointGachaBanner entity, PreInsertContext<MRubyPointGachaBanner> context) {
    }

    @Override
    public void preUpdate(MRubyPointGachaBanner entity, PreUpdateContext<MRubyPointGachaBanner> context) {
    }

    @Override
    public void preDelete(MRubyPointGachaBanner entity, PreDeleteContext<MRubyPointGachaBanner> context) {
    }

    @Override
    public void postInsert(MRubyPointGachaBanner entity, PostInsertContext<MRubyPointGachaBanner> context) {
    }

    @Override
    public void postUpdate(MRubyPointGachaBanner entity, PostUpdateContext<MRubyPointGachaBanner> context) {
    }

    @Override
    public void postDelete(MRubyPointGachaBanner entity, PostDeleteContext<MRubyPointGachaBanner> context) {
    }
}