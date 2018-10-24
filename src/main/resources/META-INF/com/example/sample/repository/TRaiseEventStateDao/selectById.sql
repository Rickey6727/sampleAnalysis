select
  /*%expand*/*
from
  t_raise_event_state
where
  account_id = /* accountId */1
  and
  event_id = /* eventId */1
