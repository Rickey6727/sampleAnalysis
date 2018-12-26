select
  /*%expand*/*
from
  t_league_event_account
where
  event_id = /* eventId */'1'
  and
  account_id = /* accountId */'1'
