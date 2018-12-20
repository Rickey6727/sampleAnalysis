select
  /*%expand*/*
from
  t_capture_captured
where
  event_id = /* eventId */1
  and
  account_id = /* accountId */1
  and
  sheep_id = /* sheepId */1
