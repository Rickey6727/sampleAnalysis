select
  /*%expand*/*
from
  t_block_account_3
where
  blocker_account_id = /* blockerAccountId */1
  and
  blocked_account_id = /* blockedAccountId */1
