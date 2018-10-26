select
  /*%expand*/*
from
  t_coin_event
where
  account_id = /* accountId */1
  and
  event_id = /* eventId */1
  and
  native_type = /* nativeType */1
  and
  product_id = /* productId */'a'
