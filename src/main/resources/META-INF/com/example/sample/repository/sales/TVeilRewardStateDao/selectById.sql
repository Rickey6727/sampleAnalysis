select
  /*%expand*/*
from
  t_veil_reward_state
where
  account_id = /* accountId */1
  and
  gacha_id = /* gachaId */1
