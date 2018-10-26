select
  /*%expand*/*
from
  t_subscription_free_gacha_history
where
  account_id = /* accountId */1
  and
  gacha_id = /* gachaId */1
