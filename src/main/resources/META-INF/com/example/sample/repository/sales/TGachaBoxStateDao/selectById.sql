select
  /*%expand*/*
from
  t_gacha_box_state
where
  account_id = /* accountId */1
  and
  gacha_id = /* gachaId */1
