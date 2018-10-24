select
  /*%expand*/*
from
  t_present_event_history
where
  event_id = /* eventId */1
  and
  t_account_id = /* tAccountId */1
  and
  f_account_id = /* fAccountId */1
