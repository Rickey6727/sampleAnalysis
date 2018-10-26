select
  /*%expand*/*
from
  t_gain_gacha_count
where
  account_id = /* accountId */1
  and
  gacha_id = /* gachaId */1
