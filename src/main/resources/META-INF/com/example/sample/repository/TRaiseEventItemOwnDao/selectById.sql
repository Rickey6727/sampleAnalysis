select
  /*%expand*/*
from
  t_raise_event_item_own
where
  account_id = /* accountId */1
  and
  item_id = /* itemId */1
