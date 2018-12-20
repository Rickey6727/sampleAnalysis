select
  /*%expand*/*
from
  t_delivery_event_state
where
  event_id = /* eventId */1
  and
  account_id = /* accountId */1
