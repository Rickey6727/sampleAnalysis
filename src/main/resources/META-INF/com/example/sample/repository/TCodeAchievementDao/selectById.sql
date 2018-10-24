select
  /*%expand*/*
from
  t_code_achievement
where
  account_id = /* accountId */1
  and
  input_code = /* inputCode */'a'
