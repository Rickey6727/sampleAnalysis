select
  /*%expand*/*
from
  t_tutorial_state
where
  account_id = /* accountId */1
  and
  tutorial_id = /* tutorialId */1
