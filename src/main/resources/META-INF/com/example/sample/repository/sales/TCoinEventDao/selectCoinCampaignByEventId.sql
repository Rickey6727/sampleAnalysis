select
    product_id , count(product_id)
from
    t_coin_event
where
    create_date::text >= /*startDate*/'0000-00-00 00:00'
and
    create_date::text <= /*endDate*/'0000-00-00 00:00'
and
    product_id = /*productId*/'com.unitedfun.android.cocoppaplay.000'
group by
    product_id
order by
    count(product_id)