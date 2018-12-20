select
    count(distinct account_id)
from
    t_login_history
where
    login_date::text >= /*startDate*/'0000-00-00 00:00:00'
and
    login_date::text < /*endDate*/'0000-00-00 00:00:00'