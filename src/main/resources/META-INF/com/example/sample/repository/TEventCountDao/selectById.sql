select
  /*%expand*/*
from
  t_event_count
where
  event_id = /* eventId */1
  and
  account_id = /* accountId */1
