select
  /*%expand*/*
from
  t_invite_history
where
  account_id = /* accountId */1
  and
  friend_account_id = /* friendAccountId */1
