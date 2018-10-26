select
  /*%expand*/*
from
  t_pay_coin
where
  account_id = /* accountId */1
  and
  native_type = /* nativeType */1
