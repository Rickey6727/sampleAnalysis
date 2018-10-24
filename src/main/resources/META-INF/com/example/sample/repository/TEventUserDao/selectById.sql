select
  /*%expand*/*
from
  t_event_user
where
  event_type = /* eventType */1
  and
  event_id = /* eventId */1
  and
  account_id = /* accountId */1
