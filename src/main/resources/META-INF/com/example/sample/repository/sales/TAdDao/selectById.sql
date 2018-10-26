select
  /*%expand*/*
from
  t_ad
where
  account_id = /* accountId */1
  and
  reward_type = /* rewardType */'a'
