select
  /*%expand*/*
from
  t_account_password
where
  account_id = /* accountId */1
  and
  mail_address = /* mailAddress */'a'
