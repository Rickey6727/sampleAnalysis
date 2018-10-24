select
  /*%expand*/*
from
  t_support_item_status
where
  account_id = /* accountId */1
  and
  support_item_id = /* supportItemId */1
