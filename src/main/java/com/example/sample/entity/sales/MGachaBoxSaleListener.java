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
public class MGachaBoxSaleListener implements EntityListener<MGachaBoxSale> {

    @Override
    public void preInsert(MGachaBoxSale entity, PreInsertContext<MGachaBoxSale> context) {
    }

    @Override
    public void preUpdate(MGachaBoxSale entity, PreUpdateContext<MGachaBoxSale> context) {
    }

    @Override
    public void preDelete(MGachaBoxSale entity, PreDeleteContext<MGachaBoxSale> context) {
    }

    @Override
    public void postInsert(MGachaBoxSale entity, PostInsertContext<MGachaBoxSale> context) {
    }

    @Override
    public void postUpdate(MGachaBoxSale entity, PostUpdateContext<MGachaBoxSale> context) {
    }

    @Override
    public void postDelete(MGachaBoxSale entity, PostDeleteContext<MGachaBoxSale> context) {
    }
}