select
  /*%expand*/*
from
  t_present_event_message
where
  account_id = /* accountId */1
  and
  m_account_id = /* mAccountId */1
