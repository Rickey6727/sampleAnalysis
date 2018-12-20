select count(*)
from t_gacha_history
where gacha_id = /* gachaId */1
and use_amount > 0
and use_amount < 20
and create_time::text >= /* salesStartDate */'0000-00-00 00:00:00.000'
and create_time::text <= /* selectEndDate */'0000-00-00 00:00:00.000'