select
    count(distinct account_id)
from
    t_gacha_history
where
    gacha_id = /* gachaId */1
and
    use_amount = 0
and
    point IS NULL
and
    give_type = 0;
