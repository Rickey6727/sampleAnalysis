select
  /*%expand*/*
from
  t_gacha_count
where
  account_id = /* accountId */1
  and
  gacha_id = /* gachaId */1
