select
  /*%expand*/*
from
  t_term_billing_history
where
  account_id = /* accountId */1
  and
  earned_date = /* earnedDate */'2010-01-23 12:34:56'
