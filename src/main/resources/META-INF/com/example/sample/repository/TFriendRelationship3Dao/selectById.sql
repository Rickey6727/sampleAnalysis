select
  /*%expand*/*
from
  t_friend_relationship_3
where
  account_id = /* accountId */1
  and
  friend_account_id = /* friendAccountId */1
