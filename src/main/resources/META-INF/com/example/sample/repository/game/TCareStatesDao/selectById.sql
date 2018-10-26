select
  /*%expand*/*
from
  t_care_states
where
  account_id = /* accountId */1
  and
  frame_id = /* frameId */1
