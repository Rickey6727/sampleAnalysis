select count(*)
from t_gacha_history
where gacha_id = /* gachaId */1
and use_amount > 0
and use_amount < 20;