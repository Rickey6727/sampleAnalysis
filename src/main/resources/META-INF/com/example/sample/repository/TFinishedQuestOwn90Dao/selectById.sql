select
  /*%expand*/*
from
  t_finished_quest_own_90
where
  account_id = /* accountId */1
  and
  quest_id = /* questId */1
  and
  condition_no = /* conditionNo */1
