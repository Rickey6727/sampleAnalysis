select
  /*%expand*/*
from
  t_stable_state
where
  account_id = /* accountId */1
  and
  stable_id = /* stableId */1
