select
  /*%expand*/*
from
  t_login_history
where
  account_id = /* accountId */1
  and
  login_date = /* loginDate */'2010-01-23'
