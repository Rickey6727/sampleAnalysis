select
  /*%expand*/*
from
  t_sheep_state
where
  account_id = /* accountId */1
  and
  order_id = /* orderId */1
