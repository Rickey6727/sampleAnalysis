select
  /*%expand*/*
from
  t_effect_item_own
where
  account_id = /* accountId */1
  and
  item_id = /* itemId */1
  and
  effect_end_date = /* effectEndDate */'2010-01-23 12:34:56'
