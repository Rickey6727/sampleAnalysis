select
  /*%expand*/*
from
  t_capture_user_state
where
  event_id = /* eventId */1
  and
  account_id = /* accountId */1
