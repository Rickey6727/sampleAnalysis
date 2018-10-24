select
  /*%expand*/*
from
  t_sp_random_account
where
  random_type = /* randomType */1
  and
  account_id = /* accountId */1
