select
  /*%expand*/*
from
  t_subscription_user_status_history
where
  account_id = /* accountId */1
  and
  created_date = /* createdDate */'2010-01-23 12:34:56'
