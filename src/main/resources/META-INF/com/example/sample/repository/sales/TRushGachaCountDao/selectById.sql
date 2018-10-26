select
  /*%expand*/*
from
  t_rush_gacha_count
where
  account_id = /* accountId */1
  and
  gacha_id = /* gachaId */1
  and
  gacha_kind = /* gachaKind */1
