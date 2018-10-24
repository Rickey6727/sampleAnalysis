select
  /*%expand*/*
from
  t_title_own
where
  account_id = /* accountId */1
  and
  title_id = /* titleId */1
