select
  /*%expand*/*
from
  t_exchange_check_finish
where
  account_id = /* accountId */1
  and
  exchange_id = /* exchangeId */1
