select
    count(*)
from
    t_gacha_history
where
    gacha_id = /* gachaId */1
and
    give_type = 2;