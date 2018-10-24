select
  /*%expand*/*
from
  t_push_setting
where
  account_id = /* accountId */1
  and
  push_type = /* pushType */1
